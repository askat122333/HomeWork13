package Suuuuuuper;

public class WaterTransport extends Transport{
    private String nameType;
    public WaterTransport(String nameType,String name){
        super(name);
        this.nameType=nameType;
    }
    public WaterTransport(){}
    public void setNameType(String name){
        this.nameType = nameType;
    }

    public String getNameType(){
        return nameType;
    }
}
