package ex7;

import java.util.Scanner;

public class TaskRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            final int A = sc.nextInt();
            final int B = sc.nextInt();
            rec1(A, B, 0);
        }
    }

    public static int rec1(int A, int B, int n) {
        if (A < B) {
            if (n != B - A) {
                System.out.print(A + n++ + " ");
                return rec1(A, B, n);
            } else {
                System.out.print(A + n + " ");
                return 0;
            }
        } else {
            if (n != A - B) {
                System.out.print(A - n++ + " ");
                return rec1(A, B, n);
            } else {
                System.out.print(A - n + " ");
                return 0;
            }
        }
    }
}
