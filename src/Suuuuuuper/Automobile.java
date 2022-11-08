package Suuuuuuper;

public class Automobile extends Auto{
    private String nameTransport;


    public Automobile(String name,String nameType, String nameAuto,String nameTransport) {
        super(nameType, nameAuto,name);
        this.nameTransport=nameTransport;
    }

    public Automobile(String nameAuto) {
        super(nameAuto);
    }

    public String getNameTransport() {
        return nameTransport;
    }

    public void setNameTransport(String nameTransport) {
        this.nameTransport = nameTransport;
    }

}
