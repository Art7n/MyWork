package ex3;

/**
 * Задание 3
 **/

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите число : ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int i = scan.nextInt();
            if (i % 2 == 0) {
                System.out.println(i + " - четное число");
            } else {
                System.out.println(i + " - нечетное число");
            }
        } else {
            System.out.println(" Вы ввели не целое число.");
        }
    }
}
