package Lesson16;

public class ZaurVersion {
    public void email(String s) {
        int a = 0; // position char '@'
        int b = 0; //position char '.'
        int c = 0; //position char ';'
        while (c < s.length()-1) {
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c + 1);
            System.out.println(s.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        ZaurVersion z = new ZaurVersion();
        z.email("ya@gmail.com;     on@yahoo.com;         ona@ukr.net;");
    }
}
