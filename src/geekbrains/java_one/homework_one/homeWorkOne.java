package geekbrains.java_one.homework_one;

public class homeWorkOne {

    // Task 1
    private static float calculation(int a, int b, int c, int d) {
        float n = c;
        float e = a*(b+(n/d));
        return e;
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
    }
}
