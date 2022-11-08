package HomeWork13;

import java.util.Scanner;

public abstract class  Locality {
    protected String name;
    protected String supervisor;
    protected Double square;
    public Locality(String name,String supervisor,Double square){
        this.name = name;
        this.supervisor = supervisor;
        this.square = square;
    }
    public  Locality(){}

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }
    public  void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void searchOfName(Locality[]localities , String name){
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        for (int i = 0; i <= localities.length-1; i++) {
            if (localities[i].name.equals(name)){
                System.out.println(localities[i].toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Locality{" +"name='"+name+','+
                ", supervisor='" + supervisor + '\'' +
                ", square=" + square +
                '}';
    }
}
