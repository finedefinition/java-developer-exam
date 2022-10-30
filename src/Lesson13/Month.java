package Lesson13;

public class Month {
    public void showNumberOfDaysInMonth(int a) {
        switch (a) {
            case 1:
                System.out.println("Month January: days 31");
                break;
            case 2:
                System.out.println("Month February: days 28");
                break;
            case 3:
                System.out.println("Month March: days 31");
                break;
            case 4:
                System.out.println("Month April: days 30");
                break;
            case 5:
                System.out.println("Month May: days 31");
                break;
            case 6:
                System.out.println("Month June: days 30");
                break;
            case 7:
                System.out.println("Month July: days 31");
                break;
            case 8:
                System.out.println("Month August: days 31");
                break;
            case 9:
                System.out.println("Month September: days 30");
                break;
            case 10:
                System.out.println("Month October: days 31");
                break;
            case 11:
                System.out.println("Month November: days 30");
                break;
            case 12:
                System.out.println("Month December: days 31");
                break;
            default:
                System.out.println("The number does not match any month");
        }
    }
}
    class MonthTest {
        public static void main(String[] args) {
            Month t = new Month();
            t.showNumberOfDaysInMonth(6);
            t.showNumberOfDaysInMonth(12);
            t.showNumberOfDaysInMonth(0);

        }
    }
