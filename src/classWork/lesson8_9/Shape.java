package classWork.lesson8_9;

/**
 * Created by Student on 26.02.2018.
 */
public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void draw();
}
