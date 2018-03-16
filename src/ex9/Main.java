package ex9;


public class Main {
    public static void main(String[] args) {
        Apple a1 = new Apple(1);
        Apple a2 = new Apple(1);
        Apple a3 = new Apple(1);
        Pear p1 = new Pear(2);
        Apricot apr1 = new Apricot(10);
        Fruits masFruits[] = {a1, a2, a3, p1, apr1};
        double result = 0;
        int applSsumm = 0;
        int pearSumm = 0;
        int apricSumm = 0;
        for (Fruits fruits : masFruits) {
            result += fruits.price(fruits.getWeight());
            System.out.println(result);
        }
        System.out.println("Price of all of fruits: " + result);
    }
}
