public class Cpu {
    private String model;
    private int nucleus;
    private String frequency;

    public Cpu(String model , int nucleus, String frequency){
        this.model = model;
        this.nucleus = nucleus;
        this.frequency= frequency;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setNucleus(int nucleus) {
        this.nucleus = nucleus;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getModel() {
        return model;
    }

    public int getNucleus() {
        return nucleus;
    }

    public String getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "Центральный процессор[" +
                "Модель='" + model + '\'' +
                ", Ядро=" + nucleus +
                ", Частота='" + frequency + '\'' +
                ']';
    }
}
