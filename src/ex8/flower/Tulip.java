package ex8.flower;

public class Tulip extends Flower {
    private static int tulipQuantity;

    public Tulip(String manufacturer, int termKeeping, int price) {
        super(manufacturer, termKeeping, price);
        this.tulipQuantity += 1;
    }

    public static int getTulipQuantity() {
        return tulipQuantity;
    }

    public static void setTulipQuantity(int tulipQuantity) {
        Tulip.tulipQuantity = tulipQuantity;
    }
}
