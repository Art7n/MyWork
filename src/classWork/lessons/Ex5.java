package classWork.lessons;

import java.util.Scanner;

/**
 * Created by Student on 22.01.2018.
 */
public class Ex5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if (a % 2 == 0) {
            System.out.println(a + " - четное.");
        } else {
            System.out.println(a + " - нечетное.");
        }
        Scanner x = new Scanner(System.in);
        if (x.hasNextInt()) {
            int i = x.nextInt();
            check(i);
        }
    }

    private static void check(int i) {
        if (i > 0 && i < 10) {
            System.out.println(i + " - от 0 до 10 или больше 10.");
        } else {
            System.out.println(i + " - не от 0 до 10, или отрицательное.");
        }
    }

}
