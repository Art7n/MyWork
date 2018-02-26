package ex7;

import java.util.Scanner;

public class TaskRecursion {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            final int A = sc.nextInt();
            final int B = sc.nextInt();
            if (A < B) {
                rec(A,B,0);
            }else{
                rec(B,A,0);
            }
        }
    }

    public int rec(int A, int B, int n) {
        if (n != B - A) {
            System.out.print(A + n++ + " ");
            return rec(A,B,n);
        }
        else return 0;
    }
}
