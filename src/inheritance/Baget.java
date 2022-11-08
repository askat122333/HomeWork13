package inheritance;

public class Baget extends Bread {
    int length;
    int scar;

    public Baget(int prise, int width, String maker, int length, int scar) {
        super(prise, width, maker);
        this.length = length;
        this.scar = scar;
    }
    void doScar(int scar){
        this.scar=scar;
        System.out.println("Рубцов нанисено-"+scar);
    }
    @Override
    void pack(){
        System.out.println("Толко в экологичный пакет!");

    }
}
