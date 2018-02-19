package ClassWork.lessons;

import java.util.Scanner;

/**
 * Created by Student on 02.02.2018.
 */
public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner x = new Scanner(System.in);
        switch(x.nextInt()){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("ВТ");
                break;
            case 3:
                System.out.println("ср");
                break;
            case 4:
                System.out.println("чт");
                break;
            case 5:
                System.out.println("пт");
                break;
            case 6:
                System.out.println("сб");
                break;
            case 7:
                System.out.println("вс");
                break;
            default:
                System.out.println("НЕ верное число ");
        }
    }
}
