package Lesson15;

public class Clock {
    public static void changeClock() {

        int hours = 0;
        OUTER:
        while (hours < 6) {
            int minutes = -1;
            MIDDLE:
            do {
                minutes++;
                if (hours > 1 && minutes % 10 == 0) {
                    break OUTER;
                }
                int seconds = 0;
                INNER:
                while (seconds < 60) {
                    if (seconds * hours > minutes) {
                        continue MIDDLE;
                    }
                    System.out.println("0" + hours + ":" + minutes + ":" + seconds);
                    seconds++;
                    //System.out.println("INNER LOOP working " + seconds + " times");
                }

                // System.out.println("MIDDLE LOOP working " + minutes + " times");
            } while (minutes < 59);
           // System.out.println("OUTER LOOP working " + hours + " times");
            hours++;
        }
    }

    public static void main(String[] args) {
        Clock.changeClock();
    }
}
