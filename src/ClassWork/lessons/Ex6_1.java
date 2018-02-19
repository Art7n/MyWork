package ClassWork.lessons;

import java.util.Scanner;

/**
 * Created by Student on 05.02.2018.
 */
public class Ex6_1 {
    public static void main(String[] args) {
        int garland = 3324;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во операций: ");
        int kol = 10;
        if (scan.hasNextInt())
        {
            kol = scan.nextInt();
        }
        sw_case(garland, scan, kol);
       // System.out.println(garland);
       // outbinary(garland);
        //run_string(garland);
        //  blink(garland);
    }

    private static void sw_case(int garland, Scanner scan,int k) {
        System.out.println("Введите число: ");
        if (scan.hasNextInt()) {
            int mode = scan.nextInt();
            switch (mode) {
                case 1:
                    blink(garland, k);
                    break;
                case 2:
                    run_string(garland, k);
                    break;
                case 3:
                    outbinary(garland);
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }

    static void blink(int gar, int k) {
        for (int i = 0; i < k; i++) {
            gar = ~gar;
            outbinary(gar);
        }
    }

    static void run_string(int gar, int k) {
        for (int i = 0; i < k; i++) {
            gar = gar << 1;
            outbinary(gar);
        }
    }


    private static void outbinary(int garland) {
        System.out.printf("%32s\n", Integer.toBinaryString(garland));
    }
}
