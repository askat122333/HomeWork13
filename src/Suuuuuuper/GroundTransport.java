package Suuuuuuper;

public class GroundTransport extends Transport{
    private String nameType;
    public GroundTransport(String name ,String nameType){
        super(name);
        this.nameType=nameType;
    }
    public GroundTransport(){}
    public void setNameType(String name){
        this.nameType = nameType;
    }

    public String getNameType(){
        return nameType;
    }
}
