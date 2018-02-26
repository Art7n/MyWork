package ex7.matrix;

import java.util.Random;


public class Matrix {
    private int mas[][];
    private int dim[] = new int[2];

    Matrix() {
        dim[0] = 3;
        dim[1] = 3;
        mas = new int[dim[0]][dim[1]];
        Random random = new Random();
        for (int i = 0; i < dim[0]; i++) {
            for (int j = 0; j < dim[1]; j++) {
                mas[i][j] = random.nextInt(99);
            }
        }
    }

    public void summ(Matrix matrix2) {
        if (this.dim[0] != matrix2.dim[0] || this.dim[1] != matrix2.dim[1]) {
        } else {
            for (int i = 0; i < dim[0]; i++) {
                for (int j = 0; j < dim[1]; j++) {
                    System.out.print(this.mas[i][j] + matrix2.mas[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public void multByScalar() {
        Random random = new Random();
        int scalar = random.nextInt(10);
        System.out.println(scalar + ":");
        for (int i = 0; i < dim[0]; i++) {
            for (int j = 0; j < dim[1]; j++) {
                System.out.print(mas[i][j] * scalar + " ");
            }
            System.out.println();
        }
    }

    public void out() {
        for (int i = 0; i < dim[0]; i++) {
            for (int j = 0; j < dim[1]; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[][] getMas() {
        return mas;
    }

    public void setMas(int[][] mas) {
        this.mas = mas;
    }

    public int[] getDim() {
        return dim;
    }

    public void setDim(int[] dim) {
        this.dim = dim;
    }
}
