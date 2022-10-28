package Lesson10.p1.p2.p3.p4;

import Lesson10.p1.A;
import Lesson10.p1.p2.p3.p4.p5.E.*;
import static Lesson10.p1.p2.p3.C.*;
import static Lesson10.p1.p2.p3.p4.p5.E.payRoaming;

public class D {
    public D(String location) {
        this.location = location;
    }

    String location;


    public static void printInfo(A a, D d) {
        System.out.println(a.name + " " + a.phoneNumber + " " + operator + " " + d.location);
        payRoaming();

    }

    public static void main(String[] args) {
        A a = new A("Ivan", 98090909);
        D d = new D("Ireland");
        printInfo(a, d);


    }
}
