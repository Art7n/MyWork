package ex4;

/**
 * Задание 1
 **/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Введите три числа");
        int a1 = scan1.nextInt();
        int a2 = scan2.nextInt();
        int a3 = scan3.nextInt();
        int r;
        a1 = (a1 < 0) ? (a1 * (-1)) : a1;
        a2 = (a2 < 0) ? (a2 * (-1)) : a2;
        a3 = (a3 < 0) ? (a3 * (-1)) : a3;
        r = (a1 < a2) ? a1 : a2;
        r = (r < a3) ? r : a3;
        System.out.println("Меньшее по модулю число : " + r);
    }
}
