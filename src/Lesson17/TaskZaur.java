package Lesson17;

public class TaskZaur {
    public static boolean equality(StringBuilder sb1, StringBuilder sb2) {
        boolean value = true;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    value = false;
                    break;
                }
            }
        } else {
            value = false;

        }
        return value;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Bebe Rexa");
        StringBuilder sb2 = new StringBuilder("Bebe Rexa");
        StringBuilder sb3 = new StringBuilder("Bebe");
        System.out.println(equality(sb1, sb2));
        System.out.println(equality(sb1, sb3));
    }
}
