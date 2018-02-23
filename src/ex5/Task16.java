package ex5;

import java.util.Scanner;

public class Task16 {

    public static void main(String args[]) {
        out:
        {
            int mass[] = new int[]{5, 12, 32, 1, 3};
            massout(mass);
            Scanner sc1 = new Scanner(System.in);
            buble(mass, sc1);
            break out;
        }
    }

    public static void buble(int[] mass, Scanner sc1) {
        int tmp = 0;
        for (int i = mass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] < mass[j + 1]) {
                    tmp = mass[j + 1];
                    mass[j + 1] = mass[j];
                    mass[j] = tmp;
                    massout(mass);
                    if (breaking(sc1)) {
                        return;
                    }
                }
            }
        }
    }


    public static boolean breaking(Scanner sc1) {
        System.out.println("Завершить сортировку? Да - нажмите 1 ");
        int ask = sc1.nextInt();
        if (ask == 1) {
            return true;
        }
        return false;
    }

    public static void massout(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();

    }
}

