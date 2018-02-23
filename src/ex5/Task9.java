package ex5;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Введите число для вычисления его факториала: ");
        double a = Math.random()*10;
        a = (int)a;
        int rez = 1;
        for (int i = 1; i <= a; i++) {
            rez *= i;
        }
        System.out.println("Факториал числа "+ a + " = " + rez);
    }
}

