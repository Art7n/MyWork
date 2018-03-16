package ex9;

public abstract class Fruits {
    private int weight;

    public Fruits(int weight) {
        this.weight = weight;
    }

    void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    abstract double price(int weight);

    @Override
    public String toString() {
        return "Fruits{" +
                "weight=" + weight +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
