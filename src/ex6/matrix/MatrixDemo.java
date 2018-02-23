package ex6.matrix;

public class MatrixDemo {
    public static void main(String args[]) {
        System.out.println("Первая матрица :");
        Matrix m1 = new Matrix();
        m1.out();
        System.out.println("Вторая матрица :");
        Matrix m2 = new Matrix();
        m2.out();
        System.out.println("Результат сложения :");
        m1.summ(m2);
        System.out.println("Умножение первой матрицы на ");
        m1.multByScalar();
        System.out.println("Умножение второй матрицы на ");
        m2.multByScalar();
    }
}
