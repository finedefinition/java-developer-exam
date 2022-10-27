package Lesson10.p1.p2.p3.p4.p5;
import static Lesson10.p1.p2.B.monthlyPay;

public class E {
    public static int roamingCost = 25;

    public static int payRoaming() {
        System.out.println("Monthly pay for roaming is: " + roamingCost);
        System.out.println("Monthly top up pay is: " + monthlyPay);
        int result = monthlyPay + roamingCost;
        System.out.println("All payees: " + result);
        return result;
    }
}
