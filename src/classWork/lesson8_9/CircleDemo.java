package classWork.lesson8_9;

/**
 * Created by Student on 26.02.2018.
 */
public class CircleDemo {
    public static void main(String[] args) {
        Shape mas[] = new Shape[5];
        mas[0] = new Circle("красного", 1, 3, 4);
        mas[1] = new Circle("красного", 1, 3, 4);
        mas[2] = new Circle("красного", 1, 3, 4);
        mas[3] = new Rectangle("красного", 1, 3, 4, 4);
        mas[4] = new Rectangle("синего", 1, 3, 4, 5);
        for (Shape mas2 : mas) {
            mas2.draw();
        }
    }
}
