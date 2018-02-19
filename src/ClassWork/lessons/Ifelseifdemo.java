package ClassWork.lessons;

/**
 * Created by Student on 02.02.2018.
 */
public class Ifelseifdemo {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        if (i == 1) {
            System.out.println(i + " - Понедельник.");
        } else if (i == 2) {
            System.out.println(i + " - Вторник.");
        } else if (i == 3) {
            System.out.println(i + " - Среда.");
        } else if (i == 4) {
            System.out.println(i + " - Четверг.");
        } else if (i == 5) {
            System.out.println(i + " - Пт.");
        } else if (i == 6) {
            System.out.println(i + " - выхи.");
        } else if (i == 7) {
            System.out.println(i + " - выхи.");
        }else {
            System.out.println("Не верное число.");
        }
    }
}
