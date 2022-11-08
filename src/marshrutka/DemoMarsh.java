package marshrutka;

import java.util.Random;

public class DemoMarsh {
    public static void main(String[] args) {
        Marshrutka marshrutka = new Marshrutka(16);
        System.out.println("My passengers :");
        Passenger passenger1 = new Passenger("Viktor",12);
        Passenger passenger2 =new Passenger("Wera",1);
        Passenger passenger3 = new Passenger("Thor",4);
        Passenger[] passengers = {passenger1,passenger2,passenger3};



        marshrutka.printPassenger(passengers);
        System.out.println();


        System.out.println("Here I added a passenger->");
        marshrutka.addPassenger("andrey",3);
        System.out.println();


        System.out.println("Here I am looking for a passenger->");
        marshrutka.searchPass("Thor",passengers);
        System.out.println();


        System.out.println("Here is my daily income->");
        System.out.println(marshrutka.getFullSalary(passengers));
    }

}
