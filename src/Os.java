public class Os {
    private String name;
    private double version;
    public Os(String name , double version){
        this.name= name;
        this.version = version;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(double version) {
        this.version = version;
    }



    public String getName() {
        return name;

    }

    public double getVersion() {
        return version;

    }


    @Override
    public String toString() {
        return "перационнтая система[" +
                "Название='" + name + '\'' +
                ", Версия=" + version +
                ']';
    }
}
