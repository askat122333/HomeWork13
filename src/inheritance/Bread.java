package inheritance;

public class Bread {
   protected int prise;
   protected int width;
   protected String maker;

    public Bread(int prise ,int width , String maker){
        this.prise = prise;
        this.width = width;
        this.maker = maker;
    }
    public Bread(){}

    void bake(){
        System.out.println("Bake!");
    }
    void pack(){
        System.out.println("Pack!");
    }

    @Override
    public String toString() {
        return "Bread{" +
                "prise=" + prise +
                ", width=" + width +
                ", maker='" + maker + '\'' +
                '}';
    }
}
