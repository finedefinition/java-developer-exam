package Lesson10.p1.p2.p3.p4;

import Lesson10.p1.A;
import static Lesson10.p1.p2.p3.p4.p5.E.*;
import static Lesson10.p1.p2.p3.C.*;
public class D {
    String location;

    public static void printInfo(A a) {
        System.out.println(a.name + " " + a.phoneNumber + " " + operator);
        payRoaming();

    }

    public static void main(String[] args) {
        A a = new A("Ivan", 98090909);
        printInfo(a);


    }
}
