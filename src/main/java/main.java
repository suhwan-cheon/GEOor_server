import config.ApplicationProperties;
import dem.Dem;
import org.xml.sax.SAXException;
import shp.ShpMain;
import sun.SunApiController;
import sun.SunInfo;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class main {

    // 이 멤버변수가 직접 쓰이지는 않지만 프로퍼티 값을 쓰기 위해 한번 호출은 시켜야 한다.
    private static final ApplicationProperties applicationProperties = new ApplicationProperties();

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        //ShpMain shpMain = new ShpMain();
        //shpMain.run();

        //sun api 호출 & parser 부분
        SunApiController sc = new SunApiController();

        /*
        * Request Parameter (순서대로)
        * 날짜, 위도, 경도, 10진수 여부
        * 자세한 설명은 getSunInfoXml 내부 참조
        * */

        //Dem dem = new Dem("C:/Users/suhwan/Desktop/test.xyz");

        SunInfo si = sc.getSunInfoXml("20190301", "12874", "3775", "y");


        //테스트 코드
        System.out.println(si.toString());
    }
}
