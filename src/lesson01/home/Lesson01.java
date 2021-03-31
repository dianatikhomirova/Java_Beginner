package lesson01.home;

public class Lesson01 {

    public static void main(String[] args) {
        System.out.println(mathCalculation(7,5,13,5));
        System.out.println(checkSumOfNumbers(10, 18));
        checkPositiveOrNegative(-1);
        helloMessage("World");
    }

        public static float mathCalculation(int a, int b, int c, float d) {

        System.out.println("Задание 1");

            return ((a * (b + (c / d))));
        }

        public static boolean checkSumOfNumbers(int a, int b) {

            System.out.println("Задание 2");

            int sum = a + b;

            return sum > 10 && sum <= 20;
        }

        public static void checkPositiveOrNegative(int a) {

        System.out.println("Задание 3");

        if (a>=0)
            System.out.println("it's positive");
        else
            System.out.println("it's negative");
        }

        public static void helloMessage(String value) {

        System.out.println("Задание 4");
        System.out.println("Привет, " + value + "!");
        }
}
