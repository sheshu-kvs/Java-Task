
class methover {

    public static void add(int a, int b) {
        int c = a + b;
        System.out.println("Addition of two Numbers:" + c);
    }

    public static void add(int a, int b, int c) {

        System.out.println("Addition of two Numbers:" + (a + b + c));

    }

    public static void add(int a, float b) {
        System.out.println("Addition of two Numbers:" + (a + b));

    }
}

public class DayFive01 {

    public static void main(String[] args) {
        methover m1 = new methover();
        m1.add(10, 20);
        m1.add(20, 30, 50);
        m1.add(30, 10.5f);

    }
}
