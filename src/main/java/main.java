import config.ApplicationProperties;
import shp.Shp;
import shp.ShpMain;
import shp.ShpMapper;

public class main {

    // 이 멤버변수가 직접 쓰이지는 않지만 프로퍼티 값을 쓰기 위해 한번 호출은 시켜야 한다.
    private static final ApplicationProperties applicationProperties = new ApplicationProperties();

    public static void main(String[] args) {
        ShpMain shpMain = new ShpMain();
        shpMain.run();
    }
}
