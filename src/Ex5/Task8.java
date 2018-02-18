package Ex5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int lamp = 321;
        System.out.println("Введите требуемую операцию : 1 - Мигание, 2 - Бегущая строка, 3 - Текущее состояние");
        Scanner sc1 = new Scanner(System.in);
        int oper = sc1.nextInt();
        switch (oper) {
            case 1:
                System.out.println("Введите сколько раз должна мигать гирлянда ");
                Scanner sc = new Scanner(System.in);
                int kolvo = sc.nextInt();
                migalka(kolvo, lamp);
                break;
            case 2:
                System.out.println("Бегущая строка ");
                begstroka(lamp);
                break;
            case 3:
                System.out.println("Состояние ");
                sostoyanie(lamp);
            default:
                System.out.println("Неверное число");
        }
    }

    public static void migalka(int a, int b) {
        int i;
        for (i = 0; i < a; i++) {
            System.out.println(Integer.toBinaryString(b));
            b = ~b;
        }
    }

    public static void begstroka(int b) {
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(Integer.toBinaryString(b));
            b = b << 1;
        }
    }

    public static void onoff(int b) {

    }

    public static void sostoyanie(int b) {
        System.out.println(Integer.toBinaryString(b));
    }
}