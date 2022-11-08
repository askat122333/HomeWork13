package Suuuuuuper;

public class AirTransport extends Transport{
    private String nameType;
    public AirTransport(String nameType,String name){
        super(name);
        this.nameType=nameType;
    }
    public AirTransport(){}
    public void setNameType(String name){
        this.nameType = nameType;
    }

    public String getNameType(){
        return nameType;
    }
}
