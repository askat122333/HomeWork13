package inheritance;

public class Lepeshka extends  Bread{
 int radius;

    public Lepeshka(int prise, int width, String maker, int radius) {
        super(prise, width, maker);
        this.radius = radius;
    }
    public  Lepeshka(){}

    void artPrint(){
        System.out.println("Узор нанесен!");
    }
    void varnish(){
        System.out.println("Лакировка завершена!");
    }

    @Override
    public String toString() {
        return "Lepeshka{" +
                "radius=" + radius +
                ", prise=" + prise +
                ", width=" + width +
                ", maker='" + maker + '\'' +
                '}';
    }
}
