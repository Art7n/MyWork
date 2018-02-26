package classWork.lesson8_9;

/**
 * Created by Student on 26.02.2018.
 */
public class Circle extends Shape {
    private int x;
    private int y;
    private int rad;

    public Circle(String color, int x, int y, int rad) {
        super(color);
        this.x = x;
        this.y = y;
        this.rad = rad;
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

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public void draw() {
        System.out.println("Круг нарисован " + getColor() + " цвета");
    }
}
