package shp;

public class ShpMain {

    public void run() {
        Shp shp = new Shp("/NF_A_A01000_A_A01000_000000.shp");
        ShpMapper shpMapper = new ShpMapper(shp);
        shpMapper.printAttributes();
    }
}
