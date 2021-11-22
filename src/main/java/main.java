import Algorithms.HillshadeAlgorithm;
import Algorithms.TransformCoordinate;
import config.ApplicationProperties;
import crawling.Crawler;
import dem.DemInfo;
import dem.DemService;
import sun.SunService;
import sun.SunInfo;
import java.util.ArrayList;

public class main {

    // 멤버변수가 직접 쓰이지는 않지만 프로퍼티 값을 쓰기 위해 한번 호출은 시켜야 한다.
    private static final ApplicationProperties applicationProperties = new ApplicationProperties();

    private static DemService dem = new DemService();
    private static SunService sun = new SunService();
    private static TransformCoordinate tf;

    public static void main(String[] args) throws Exception {
//        ShpMain shpMain = new ShpMain();
//        shpMain.run();
//        sun.run();
//        sun.set();
//        sun.get();
//        sun.test1();

        /*
            dem api 호출 부분
            반환 값 : 253 x 314 모양의 2차원 ArrayList
         */
        dem.run();
        ArrayList<ArrayList<DemInfo>> arr = dem.getDEM();

        /*
            2021-11-22
            작성자 : 천수환
            내용 : dem 좌표를 이용해 태양고도각 추출
            사용 방법
            1) 2차원 dem ArrayList를 4등분, 4개의 사각형으로 나눈다.
            2) 각각의 사각형의 중심 dem 값을 TransformCoordinate를 이용해 위,경도로 변환
            3) 변환된 위,경도를 크롤러를 이용해 고도각으로 변환
            4) 변환된 고도각을 똑같이 2차원 SunInfo ArrayList의 사각형에 위치한 곳으로 모두 채운다.
         */

        Crawler crawler = new Crawler();
        ArrayList<SunInfo> si = new ArrayList<SunInfo>();

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                int dem_x = arr.get((i*126 + (i + 1) * 126) / 2).get((j*157 + (j + 1) * 157) / 2).getX();
                int dem_y = arr.get((i*126 + (i + 1) * 126) / 2).get((j*157 + (j + 1) * 157) / 2).getY();
                tf = new TransformCoordinate(dem_x, dem_y);
                crawler.run(tf.getLatitude(), tf.getLongitude());
                si = crawler.get();
            }
        }

        tf = new TransformCoordinate(574118, 354211);
        System.out.println(tf.getLatitude());
        System.out.println(tf.getLongitude());
        //System.out.println(tf.toString());

        /*
            2021-11-22
            작성자 : 천수환
            내용 : HillshadeAlgorithm 사용 부분
            사용 방법
            1) HillshadeAlgorithm 클래스 선언 (hs)
            2) hsConverter 함수에 태양 고도각, dem값을 넣는다. (둘다 2차원 ArrayList)
            3) 리턴된 값은 해당 dem 격자의 음영기복도(hillshade)값이 된다. * 테두리 제외
         */
        HillshadeAlgorithm hs = new HillshadeAlgorithm();
        ArrayList<ArrayList<Double>> hsArr = hs.hsConverter(sun.get(), dem.getDEM());
        System.out.println(hsArr.toString()); // 테스트 코드


    }
}