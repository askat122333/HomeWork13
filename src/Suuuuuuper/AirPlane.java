package Suuuuuuper;

public class AirPlane extends AirTransport{
    private String nameTransport;

    public AirPlane(String nameType, String nameTransport,String name) {
        super(nameType,name);
        this.nameTransport = nameTransport;
    }

    public AirPlane(String nameTransport) {
        this.nameTransport = nameTransport;
    }
    public AirPlane(){}

    public String getNameTransport() {
        return nameTransport;
    }

    public void setNameTransport(String nameTransport) {
        this.nameTransport = nameTransport;
    }
}
