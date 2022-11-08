public class Notebook {
  private   Hdd hdd;
  private   Ram ram;
  private   Os os;
  private   Cpu cpu;


    public Notebook(Hdd hdd, Ram ram, Os os, Cpu cpu) {
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        this.cpu = cpu;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Os getOs() {
        return os;
    }

    public void setOs(Os os) {
        this.os = os;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Ноутбук[\n" +
                "Жеский диск=" + hdd +
                ", Оперативная память=" + ram +
                "\n, Операционная система =" + os +
                ", Центральный процессор=" + cpu +
                ']';
    }
}
