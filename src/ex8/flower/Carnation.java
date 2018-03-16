package ex8.flower;

public class Carnation extends Flower {
    private int carnationQuantity;
    public Carnation(String manufacturer, int termKeeping, int price) {
        super(manufacturer, termKeeping, price);
        this.carnationQuantity +=1;
    }

    public int getCarnationQuantity() {
        return carnationQuantity;
    }

    public void setCarnationQuantity(int carnationQuantity) {
        this.carnationQuantity = carnationQuantity;
    }
}

