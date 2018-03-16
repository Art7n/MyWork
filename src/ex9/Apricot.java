package ex9;

public class Apricot extends Fruits {
    public Apricot(int weight) {
        super(weight);
    }

    @Override
    double price(int weight) {
        double apricotPrice = 20.5;
        return weight * apricotPrice;
    }

}
