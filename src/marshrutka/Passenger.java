package marshrutka;

import java.util.Objects;

public class Passenger {
   private String name;
   private final int fare = 15;
   private int number;
   public  Passenger(String name , int number){
       this.name = name;
       this.number =number;
   }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getFare() {
        return fare;
    }

    public  int getNumber(){
       return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", fare=" + fare +
                ", number=" + number +
                '}';
    }



}
