package ex5;

import java.util.Scanner;

public class Task18gir {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int gir[] = {1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1};
        System.out.println("Введите какую операцию следует выполнить: 1 - Мигание 2 - Бегущая строка 3 - Включить,Выключить ");
        if (sc.hasNextInt()) {
            int choise = sc.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("Введите сколько раз должна мигать гирлянда ");
                    if (sc.hasNextInt()) {
                        int kolvo = sc.nextInt();
                        currentState(gir);
                        flasher(gir, kolvo);
                        break;
                    }
                case 2:
                    runningStr(gir);
                    break;
                case 3:
                    onoff(gir);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }

    public static void runningStr(int[] gir) {
        int temp[] = new int[32];
        System.arraycopy(gir, 0, temp, 0, 32);
        for (int i = 0; i < 5; i++) {
            System.arraycopy(temp, 0, temp, 1, 31);
            currentState(temp);
        }
    }

    public static void flasher(int[] gir, int kolvo) {
        System.out.println("Мигание " + kolvo + " раз(а):");
        for (int i = kolvo; i > 0; i--) {
            for (int j = 0; j < 32; j++) {
                if (gir[j] == 0) {
                    gir[j] = 1;
                } else {
                    gir[j] = 0;
                }
                System.out.print((gir[j]) + " ");
                if (j == 31) {
                    System.out.println();
                }
            }
        }
    }

    public static void currentState(int[] gir) {
        for (int i = 0; i < 32; i++) {
            System.out.print(gir[i] + " ");
        }
        System.out.println();
    }

    public static void onoff(int gir[]) {
        System.out.println("До выключения: ");
        currentState(gir);
        System.out.println("После: ");
        for (int i = 0; i < 32; i++) {
            if (gir[i] == 1) {
                gir[i] = 0;
            } else {
                gir[i] = 1;
            }
            System.out.print(gir[i] + " ");
        }
    }
}


