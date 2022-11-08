package thirdNovember;

public class Bread {
    Double width;
    Double prise;
   static Integer count;
    public Bread(Double width, Double prise){
        this.width = width;
        this.prise = prise;
    }

    public Bread(Double width, Double prise, Integer count) {
        this.width = width;
        this.prise = prise;
        this.count = count;
    }

    public  Double getWidth(){
        return width;
    }
    public Double getPrise(){
        return prise;
    }


    public void setWidth(Double width ){
        this.width=width;
    }
    public void setPrise(Double prise ){
        this.prise=prise;
    }

    public static Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count= count;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "width=" + width +
                ", prise=" + prise +
                ", count="+count+
                '}';
    }
}
