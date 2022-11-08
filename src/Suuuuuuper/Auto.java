package Suuuuuuper;

public class Auto extends GroundTransport{
    private String nameAuto;
    public Auto(String name,String nameType,String nameAuto){
        super(nameType,name);
        this.nameAuto= nameAuto;
    }

    public Auto(String nameAuto) {
        this.nameAuto = nameAuto;
    }

    private Auto(){}

    public String getNameAuto() {
        return nameAuto;
    }

    public void setNameAuto(String nameAuto) {
        this.nameAuto = nameAuto;
    }
}
