public class SunInfo {

    //날짜
    String locdate;
    //지역
    String location;
    //경도
    String longitude;
    //경도(10진수)
    String longitudeNum;
    //위도
    String latitude;
    //위도(10진수)
    String latitudeNum;
    //9시 방위각
    String azimuth_09;
    //9시 고도
    String altitude_09;
    //12시 방위각
    String azimuth_12;
    //12시 고도
    String altitude_12;
    //15시 방위각
    String azimuth_15;
    //15시 고도
    String altitude_15;
    //18시 방위각
    String azimuth_18;
    //18시 고도
    String altitude_18;
    //남중 고도
    String altitudeMeridian;

    /* 고정 변수 */
    //페이지당 항목수
    Integer numOfRows = 10;
    //페이지
    Integer pageNo = 1;

    /* Constructor */

    public SunInfo(String locdate, String location, String longitude, String longitudeNum, String latitude, String latitudeNum, String azimuth_09, String altitude_09, String azimuth_12, String altitude_12, String azimuth_15, String altitude_15, String azimuth_18, String altitude_18, String altitudeMeridian) {
        this.locdate = locdate;
        this.location = location;
        this.longitude = longitude;
        this.longitudeNum = longitudeNum;
        this.latitude = latitude;
        this.latitudeNum = latitudeNum;
        this.azimuth_09 = azimuth_09;
        this.altitude_09 = altitude_09;
        this.azimuth_12 = azimuth_12;
        this.altitude_12 = altitude_12;
        this.azimuth_15 = azimuth_15;
        this.altitude_15 = altitude_15;
        this.azimuth_18 = azimuth_18;
        this.altitude_18 = altitude_18;
        this.altitudeMeridian = altitudeMeridian;
    }

    /* Getter */

    public String getLocdate() {
        return locdate;
    }

    public String getLocation() {
        return location;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLongitudeNum() {
        return longitudeNum;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLatitudeNum() {
        return latitudeNum;
    }

    public String getAzimuth_09() {
        return azimuth_09;
    }

    public String getAltitude_09() {
        return altitude_09;
    }

    public String getAzimuth_12() {
        return azimuth_12;
    }

    public String getAltitude_12() {
        return altitude_12;
    }

    public String getAzimuth_15() {
        return azimuth_15;
    }

    public String getAltitude_15() {
        return altitude_15;
    }

    public String getAzimuth_18() {
        return azimuth_18;
    }

    public String getAltitude_18() {
        return altitude_18;
    }

    public String getAltitudeMeridian() {
        return altitudeMeridian;
    }
}
