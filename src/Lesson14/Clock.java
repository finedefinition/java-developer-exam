package Lesson14;

public class Clock {
    public static void changeClock() {
        HOURS:
        for (int i = 0; i < 6; i++) {
           MINUTES:
           for (int j = 0; j < 60; j++) {
                if (i > 1 && j % 10 == 0){
                    break HOURS;
                }
                SECONDS:
                for (int k = 0; k < 60; k++) {
                    if (k * i > j) {
                        continue MINUTES;
                    }
                    System.out.println("0" + i + ":" + j + ":" + k);
                }
                
            }

        }
    }
}
class ClockTest {
    public static void main(String[] args) {
        Clock.changeClock();
    }
}
