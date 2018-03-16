package ex9;

public class Apple extends Fruits {
    private int appleWeight;

    public Apple(int weight) {
        super(weight);
        appleWeight += weight;
        System.out.println(appleWeight);
    }

    @Override
    double price(int weight) {
        double applePrice = 15.5;
        return weight * applePrice;
    }

    public int getAppleWeight() {
        return appleWeight;
    }

    public void setAppleWeight(int appleWeight) {
        this.appleWeight = appleWeight;
    }
}
