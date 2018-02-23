package ex5;

public class Task15 {
    public static void main(String args[]) {
        int mass[] = new int[]{5, 12, 32, 1, 3};
        int tmp = 0;
        System.out.println("");
        massout(mass);
        for (int i = 0; i < mass.length; i++) {
            for (int j = mass.length - 1; j > i; j--) {
                if (mass[j] < mass[j - 1]) {
                    tmp = mass[j - 1];
                    mass[j - 1] = mass[j];
                    mass[j] = tmp;
                }
            }
        }
        massout(mass);
    }

    public static void massout(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
    }
}
