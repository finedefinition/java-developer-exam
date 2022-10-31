package Lesson16;

public class Email {
    public static void emailCutter(String a) {
        char t;
        for (int i = 0; i < a.length(); i++) {
            t = a.charAt(i);
            if (t == '@') {
                for (; t != '.'; i++) {
                    System.out.print(a.charAt(i+1));
                    t = a.charAt(i+2);
                }
                System.out.println();
             /*   do {
                    i++;
                    System.out.print(a.charAt(i));
                    t = a.charAt(i);
                } while (t != '.');
             */
            }
        }
    }
}
    class EmailTest {
        public static void main(String[] args) {
            Email.emailCutter("sergiibezrukov@gmail.com;bax@yahoo.com;ororo@ukr.net;");
        }
    }

