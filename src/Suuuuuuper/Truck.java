package Suuuuuuper;

public class Truck extends GroundTransport{
    private String nameAuto;

    public Truck(String name,String nameType, String nameAuto) {
        super(nameType,name);
        this.nameAuto = nameAuto;
    }

    public Truck() {}

    public String getNameAuto() {
        return nameAuto;
    }

    public void setNameAuto(String nameAuto) {
        this.nameAuto = nameAuto;
    }
}
