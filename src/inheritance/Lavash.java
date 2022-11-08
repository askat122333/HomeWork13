package inheritance;

public class Lavash extends Bread {
    public Lavash(int prise, int width, String maker) {
        super(prise, width, maker);
    }

    void wrapUp(){
        System.out.println("Лаваш завернут!");
    }
    @Override
    void bake(){
        System.out.println("Я лаваш , меня испекли");
    }

}
