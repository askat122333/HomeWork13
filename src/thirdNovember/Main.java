package thirdNovember;

public class Main {
    public static void main(String[] args) {
//        int i = 10;
//        Integer i2 = 10;
//        if (i == i2) {
//            System.out.println("=");
//        }else {
//            System.out.println("!=");
//        }

        Integer i ;//int
        Double d;//double
        Short sh;//short
        Byte by;// byte
        Character ch;// char
        Long l;//long
        Float f;//float
        Boolean b ;//boolean
        final Double PI = 3.14d;


        Bread bread = new Bread(300d,35d);
        Bread bread2 = new Bread(200d,24d);
        Bread bread3 = new Bread(400d,45d,3);


        System.out.println(bread);
        System.out.println(bread2);
        System.out.println(bread3);
        System.out.println(Bread.getCount());
    }
}
