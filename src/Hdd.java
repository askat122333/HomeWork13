public class Hdd {
  private  int size;
  private int speed;

    public Hdd(int size, int speed) {
        this.size = size;
        this.speed = speed;
    }


    public void setSize(int size) {
        this.size = size;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public int getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }


    @Override
    public String toString() {
        return "Жеский диск[" +
                "Размер=" + size +
                ", скорость=" + speed +
                ']';
    }
}
