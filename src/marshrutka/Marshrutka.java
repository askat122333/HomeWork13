package marshrutka;

public class Marshrutka {
  private int places;
  private Passenger passenger;

  public  Marshrutka(int places){
      this.places = places;
  }
  public int getPlaces(){
      return places;
  }
  public void setPlaces(int places){
      this.places = places;
  }

  public void printPassenger(Passenger[]passengers){
      for (int i = 0; i <= passengers.length-1; i++) {
          System.out.println(passengers[i].toString());
      }
  }

 public  void addPassenger(String name ,int number){
      Passenger passenger = new Passenger(name,number);
     System.out.println(passenger.toString());
      if ( number == 16){
          System.out.println(" Маршрутка полная");
      }else if (number > 16){
          System.out.println(passenger.getName()+" ты не поместишся");
      }else {
          System.out.println("Есть свободные места");
      }
 }
 public void searchPass(String name,Passenger[]passengers){
     for (int i = 0; i <= passengers.length-1; i++) {
         if (passengers[i].getName().equals(name)) {
             System.out.println (passengers[i].toString()) ;
         }

     }
 }
 public String getFullSalary(Passenger [] passengers){
      return passengers.length * 15 +" Com";
 }
}
