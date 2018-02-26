package ex3;

/**
 * Задание 4
 **/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа : ");
        Scanner scan1 = new Scanner(System.in);
        if (scan1.hasNextInt() && scan1.hasNextInt()) {
            int a1 = scan1.nextInt();
            int a2 = scan1.nextInt();
            System.out.println("Их сумма: " + a1 + " + " + a2 + " = " + (a1 + a2) + "\n" +
                    "Их разность: " + a1 + " - " + a2 + " = " + (a1 - a2) + "\n" +
                    "Их произведение: " + a1 + " * " + a2 + " = " + (a1 * a2) + "\n" +
                    "Их частное: " + a1 + " / " + a2 + " = " + (a1 / a2) + "\n");
        } else {
            System.out.println(" Вы ввели не целые числа.");
        }
    }
}


