package Suuuuuuper;

public class UnderGroundTransport extends Transport{
    private String nameType;
    public UnderGroundTransport(String nameType){
        this.nameType=nameType;
    }
    public UnderGroundTransport(){}
    public void setNameType(String name){
        this.nameType = nameType;
    }

    public String getNameType(){
        return nameType;
    }
}
