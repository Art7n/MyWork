package ex8.flower;

public class Rose extends Flower {
    private static int roseQuantity = 0;

    public Rose(String manufacturer, int termKeeping, int price) {
        super(manufacturer, termKeeping, price);
        this.roseQuantity +=1;
        System.out.println("create rose"+roseQuantity);
    }

    public static int getRoseQuantity() {
        return roseQuantity;
    }

    public static void setRoseQuantity(int roseQuantity) {
        Rose.roseQuantity = roseQuantity;
    }
}
