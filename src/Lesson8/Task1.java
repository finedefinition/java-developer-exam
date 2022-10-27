package Lesson8;

public class Task1 {

    private static final double PI = 3.1415926;

    public static double circumference(double radius) {
        double result = 2 * PI * radius;
        System.out.println("Circumference with radius: " + radius + " = " + result);
        return result;
    }

    public static int multiplicationNumber(int a, int b, int c) {
        int result = a * b * c;
        System.out.println("Result: " + a + " * " + b + " * " + c + " = " + result);
        return result;
    }

    public static void divideNumber(int a, int b) {
        int integer = a / b;
        int remainder = a % b;
        System.out.println("Whole integer: " + integer + " remainder: " + remainder);
    }

    public double findSquareCircle(double radius) {
        double result = PI * radius * radius;
        System.out.println("Square of circle with radius: " + radius + " = " + result);
        return result;
    }

    public void  показателиКруга(double radius) {
        double circumference = 2 * PI * radius;
        System.out.println("Circumference with radius: " + radius + " = " + circumference);
        double result = PI * radius * radius;
        System.out.println("Square of circle with radius: " + radius + " = " + result);
        System.out.println();
    }
}

