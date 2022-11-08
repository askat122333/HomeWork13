package inheritance;

public class Main {
    public static void main(String[] args) {
        Bread bread =new Bread(25,100,"Kanat");
        System.out.println(bread.toString());


        Lepeshka lepeshka = new Lepeshka(23,120,"Kut",10);
        System.out.println(lepeshka);
        System.out.println();


        Lavash lavash = new Lavash(30,100,"Wera");
        lavash.bake();
        lavash.pack();
        lavash.wrapUp();
        System.out.println();



        Baget baget = new Baget(50,200,"Slaboda",40,4);
        baget.pack();
        baget.doScar(4);
        System.out.println();


        lepeshka.artPrint();
        lepeshka.varnish();


    }
}
