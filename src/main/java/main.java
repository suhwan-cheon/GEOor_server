public class main {
    public static void main(String[] args) throws Exception {



        SunApiController sc = new SunApiController();
        String sunXml = sc.getSunInfoXml("20150101", "12659", "3734", "N");
        SunInfo si = sc.getSunInfo(sunXml);
        System.out.println(si.getAltitude_09());
    }
}
