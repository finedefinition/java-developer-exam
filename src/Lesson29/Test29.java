package Lesson29;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Test29 {
    public static DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    public static DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    public static void change(LocalDateTime ld1, LocalDateTime ld2, Period p, Duration d) {
        while (ld1.isBefore(ld2)) {
            System.out.print("Работаем с: " + ld1.format(dtf1));
            ld1 = ld1.plus(p);
            System.out.println(" До: " + ld1.format(dtf1));

            System.out.print("Отдыхаем с: " + ld1.format(dtf2));
            ld1 = ld1.plus(d);
            System.out.println(" До: " + ld1.format(dtf2));
        }
    }
}

class Test29a {
    public static void main(String[] args) {
        LocalDateTime ld1 = LocalDateTime.of(2016, 01, 01, 9, 00);
        LocalDateTime ld2 = LocalDateTime.of(2016, 12, 10, 9, 00);
        Period p1 = Period.ofDays(14);
        Duration d1 = Duration.ofDays(7);
        Test29.change(ld1, ld2, p1, d1);
    }
}