package ex3;

/**
 * Задание 2
 **/

public class Task2 {
    public static void main(String[] args) {
        transbyte();
        transchar();
        transshort();
        transint();
        transdouble();
        translong();
        transfloat();
    }

    public static void transbyte() {
        byte a = 1;
        short b = 2;
        char c = 'c';
        int d = 3;
        long e = 4444;
        float f = 5.5f;
        double g = 6.6;
        a = (byte) b;
        a = (byte) c;
        a = (byte) d;
        a = (byte) e;
        a = (byte) f;
        a = (byte) g;
    }

    public static void transshort() {
        byte a = 1;
        short b = 2;
        char c = 'c';
        int d = 3;
        long e = 4444;
        float f = 5.5f;
        double g = 6.6;
        b = a;
        b = (short) c;
        b = (short) d;
        b = (short) e;
        b = (short) f;
        b = (short) g;
    }

    public static void transchar() {
        byte a = 1;
        short b = 2;
        char c = 'c';
        int d = 3;
        long e = 4444;
        float f = 5.5f;
        double g = 6.6;
        c = (char) a;
        c = (char) b;
        c = (char) d;
        c = (char) e;
        c = (char) f;
        c = (char) g;
    }

    public static void transint() {
        byte a = 1;
        short b = 2;
        char c = 'c';
        int d = 3;
        long e = 4444;
        float f = 5.5f;
        double g = 6.6;
        d = a;
        d = b;
        d = c;
        d = (int) e;
        d = (int) f;
        d = (int) g;
    }

    public static void translong() {
        byte a = 1;
        short b = 2;
        char c = 'c';
        int d = 3;
        long e = 4444;
        float f = 5.5f;
        double g = 6.6;
        e = a;
        e = b;
        e = c;
        e = d;
        e = (long) f;
        e = (long) g;
    }

    public static void transfloat() {
        byte a = 1;
        short b = 2;
        char c = 'c';
        int d = 3;
        long e = 4444;
        float f = 5.5f;
        double g = 6.6;
        f = a;
        f = b;
        f = c;
        f = e;
        f = (float) g;
    }

    public static void transdouble() {
        byte a = 1;
        short b = 2;
        char c = 'c';
        int d = 3;
        long e = 4444;
        float f = 5.5f;
        double g = 6.6;
        g = a;
        g = b;
        g = c;
        g = d;
        g = e;
        g = f;
    }
}

