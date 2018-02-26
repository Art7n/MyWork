package classWork.lesson8_9;

/**
 * Created by Student on 26.02.2018.
 */
public class Rectangle extends Shape {
    private int x;
    private int y;
    private int z;
    private int j;

    public Rectangle(String color, int x, int y, int z, int j) {
        super(color);
        this.x = x;
        this.y = y;
        this.z = z;
        this.j = j;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public void draw() {
        System.out.println("Прямоугольник нарисован " + getColor() + " цвета");
    }
}
