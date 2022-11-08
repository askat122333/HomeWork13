package Suuuuuuper;

public class Ship extends WaterTransport{
    private String nameTransport;

    public Ship(String nameType, String nameTransport,String name) {
        super(nameType,name);
        this.nameTransport = nameTransport;
    }

    public Ship(String nameTransport) {
        this.nameTransport = nameTransport;
    }
    public Ship(){}

    public String getNameTransport() {
        return nameTransport;
    }

    public void setNameTransport(String nameTransport) {
        this.nameTransport = nameTransport;
    }
}
