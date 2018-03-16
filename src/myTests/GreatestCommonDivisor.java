package myTests;

import java.util.Scanner;

public class GreatestCommonDivisor {
        public static void main(String[] args) {
            int x, y;
            System.out.println("Enter two numbers");
            Scanner a = new Scanner(System.in);
            if (a.hasNextInt()) {
                x = a.nextInt();
                y = a.nextInt();
            } else {
                x = 1;
                y = 1;
                System.out.println("Error");
            }
            int result = 1;
            int i = 0;
            do {

                i++;
                if (x % i == 0 && y % i == 0) {
                    result = i;
                }
            } while (i < x || i < y);
            System.out.println("Result is "+ result);
        }
    }

