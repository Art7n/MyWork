package Ex5;

public class Task17 {
    public static void main(String args[]) {
        int mas[][] = new int[][]{
                {1, 2, 5, 35, 0, 5, 1, 7},
                {51, 25, 3, 31, 12, 51, 1, 96},
                {81, 25, 24, 4, 12, 1, 3, 28},
                {5, 63, 0, 6, 2, 23, -1, 31, 9},
                {5, 3, 5, 6, 71, 21, 23, 1, 20}};
        int masres[][] = new int[5][2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == 0) {
                    masres[i][0] = mas[i][j];
                    masres[i][1] = mas[i][j];
                }
                if (masres[i][1] < mas[i][j]) {
                    masres[i][1] = mas[i][j];
                }
                if (masres[i][0] > mas[i][j]) {
                    masres[i][0] = mas[i][j];
                }

            }
        }
        massiveView1(mas);
        massiveView2(masres);

    }

    public static void massiveView1(int[][] mas) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void massiveView2(int[][] mas) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
