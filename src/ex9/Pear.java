package ex9;

public class Pear extends Fruits {
    public Pear(int weight) {
        super(weight);
    }

    @Override
    double price(int weight) {
        double pearPrice = 30;
        return weight * pearPrice;
    }
}