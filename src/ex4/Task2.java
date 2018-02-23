package ex4;

/**
 * Задание 2
 **/

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int lamp = 321;
        System.out.println("Введите сколько раз должна мигать гирлянда ");
        Scanner sc = new Scanner(System.in);
        int kolvo = sc.nextInt();
        migalka(kolvo,lamp);
        System.out.println("Бегущая строка ");
        begstroka(lamp);
        System.out.println("Состояние ");
        sostoyanie(lamp);
    }
    public static void migalka(int a,int b){
        int i;
        for(i = 0; i < a; i++){
            System.out.println(Integer.toBinaryString(b));
            b = ~b;
        }
    }
    public static void begstroka(int b){
        int i;
        for(i = 0; i < 10; i++){
            System.out.println(Integer.toBinaryString(b));
            b = b<<1;
        }
    }
    public static void onoff(int b){

    }
    public static void sostoyanie(int b) {
        System.out.println(Integer.toBinaryString(b));
    }
}
