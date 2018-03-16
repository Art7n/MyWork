package ex8.flower;

public class Flower {
    private String manufacturer;
    private int termKeeping;
    private int price;
    private static int quantity = 0;

    public Flower(String manufacturer, int termKeeping, int price) {
        this.manufacturer = manufacturer;
        this.termKeeping = termKeeping;
        this.price = price;
        this.quantity += 1;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getTermKeeping() {
        return termKeeping;
    }

    public void setTermKeeping(int termKeeping) {
        this.termKeeping = termKeeping;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
