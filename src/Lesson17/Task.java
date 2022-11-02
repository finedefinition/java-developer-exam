package Lesson17;

public class Task {
    public static boolean equality(StringBuilder sb1, StringBuilder sb2) {
        boolean value = false;
        String s1 = new String(sb1);
        String s2 = new String(sb2);
        if (s1.equals(s2)) {
            value = true;
        }
        System.out.println(value);
        return value;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Bebe Rexa");
        StringBuilder sb2 = new StringBuilder("Bebe Rexa");
        StringBuilder sb3 = new StringBuilder("Bebe");
        equality(sb1, sb2);
        equality(sb2, sb3);
    }
}
