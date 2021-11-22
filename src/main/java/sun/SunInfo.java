package sun;

public class SunInfo {

    //시각
    Integer time;
    //방위각
    Double azimuth;
    //고도
    Double altitude;
    //적경
    Double ascension;
    //적위
    Double declination;

    public SunInfo(Integer time, Double azimuth, Double altitude, Double ascension, Double declination) {
        this.time = time;
        this.azimuth = azimuth;
        this.altitude = altitude;
        this.ascension = ascension;
        this.declination = declination;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Double getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(Double azimuth) {
        this.azimuth = azimuth;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public Double getAscension() {
        return ascension;
    }

    public void setAscension(Double ascension) {
        this.ascension = ascension;
    }

    public Double getDeclination() {
        return declination;
    }

    public void setDeclination(Double declination) {
        this.declination = declination;
    }

    @Override
    public String toString() {
        return "SunInfo{" +
                "time=" + time +
                ", azimuth=" + azimuth +
                ", altitude=" + altitude +
                ", ascension=" + ascension +
                ", declination=" + declination +
                '}';
    }
}
