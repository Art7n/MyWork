package ex8.flower;

public class Main {
    public static void main(String[] args) {
        int rosePrice = 3;
        int tulipPrice = 2;
        int carnationsPrice = 1;
        Rose rose1 = new Rose("Rose firm", 7, rosePrice);
        Rose rose2 = new Rose("Rose firm", 7, rosePrice);
        Rose rose3 = new Rose("Rose firm", 7, rosePrice);
        Carnation carnations = new Carnation("Carnations firm", 5, carnationsPrice);
        Tulip tulips = new Tulip("Tulip firm", 3, tulipPrice);
        Flower bouquet1[] = {rose1,rose2,rose3, carnations, tulips};
        System.out.println("Букет 1: \n"+"Количество роз - "+rose1.getRoseQuantity()+
                "\nКоличество гвоздик - "+ carnations.getCarnationQuantity()+
                "\nКоличество тюльпанов - " + tulips.getTulipQuantity()+
                "\n\nВсего цветов "+bouquet1.length+"\nСуммарная стоимость цветов = "+
                (rose1.getRoseQuantity()*rosePrice+
                +carnations.getCarnationQuantity()*carnationsPrice
                +tulips.getTulipQuantity()*tulipPrice));
    }
}
