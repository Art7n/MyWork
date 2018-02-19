package ClassWork.ex6massives;

/**
 * Created by Student on 09.02.2018.
 */
public class Task3 {
    public static void main(String[] args) {
        String mass[][] = new String[3][6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0) {
                    mass[i][j] ="" + 'a'  + (j+1);
                    System.out.print(mass[i][j] + " ");
                } else if (i == 1) {
                    mass[i][j] = 'b' + "" + (j+1);
                    System.out.print(mass[i][j] + " ");
                } else if (i == 2) {
                    mass[i][j] = 'c' + ""+ (j+1);
                    System.out.print(mass[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
}
