public class Ram {
    private int size;
    private String model;

    public Ram(int size, String model) {
        this.size = size;
        this.model = model;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public int getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }


    @Override
    public String toString() {
        return "оперативная память[" +
                "размер=" + size +
                ", модель='" + model + '\'' +
                '}';
    }
}
