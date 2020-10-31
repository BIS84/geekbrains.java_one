package geekbrains.java_one.homework_one;

public class homeWorkOne {

    // Task 1
    private static float calculation(int a, int b, int c, int d) {
        float n = c;
        float e = a*(b+(n/d));
        return e;
    }

    // Task 2
    private static boolean rangeSum(int a, int b) {
        boolean c;
        if((a + b) >= 10 && (a + b) <= 20) {
            c = true;
        } else {
            c = false;
        }
        return c;
    }

    // Task 3
    private static void positiveOrNot(int a) {
        if(a >= 0) {
            System.out.println(a + " - positive number.");
        } else {
            System.out.println(a + " - negative number.");
        }
    }

    // Check
    public static void main(String[] args) {

        String multipleLines1 = System.lineSeparator() + "Task 1";
        System.out.println(multipleLines1);
        float a = calculation(2, 3, 4, 5);
        System.out.println("a = " + a);
        if (a == 7.6f) {
            System.out.println("Yes!");
        }

        String multipleLines2 = System.lineSeparator() + "Task 2";
        System.out.println(multipleLines2);
        int k = 4;
        int m = 5;
        int g = 0;
        boolean trueOrFalse = rangeSum(k, m);
        System.out.println("10 <= " + (k + m) + " <= 20 - "+ trueOrFalse);
        k = 5;
        trueOrFalse = rangeSum(k, m);
        System.out.println("10 <= " + (k + m) + " <= 20 - "+ trueOrFalse);
        m = 15;
        trueOrFalse = rangeSum(k, m);
        System.out.println("10 <= " + (k + m) + " <= 20 - "+ trueOrFalse);
        k = 6;
        trueOrFalse = rangeSum(k, m);
        System.out.println("10 <= " + (k + m) + " <= 20 - "+ trueOrFalse);

        String multipleLines3 = System.lineSeparator() + "Task 3";
        System.out.println(multipleLines3);
        positiveOrNot(-33);
        positiveOrNot(32);
        positiveOrNot(0);

    }
}
