package Lesson6;

public class OverloadedMethods {
    public static void main(String[] args) {
       adding(10,20,30,40);
       adding(10,20,30);
       adding(10,20);
       adding(10);
       adding();
    }
    static int  adding(int a, int b, int c, int d) {
        int result = a + b + c + d;
        System.out.println(result);
        return result;
    }

    static int adding(int a, int b, int c) {
        int result = a + b + c;
        System.out.println(result);
        return result;
    }

    static int adding(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;
    }

    static int adding(int a) {
        int result = a;
        System.out.println(result);
        return result;
    }

    static int adding() {
        int result = 0;
        System.out.println(result);
        return result;
    }
}