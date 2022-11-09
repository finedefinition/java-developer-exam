package Lesson19;

public class Task {
    public static String[] abc(String[]... arrays) {
        int length = 0;
        for (String[] a : arrays) {
            length += a.length;
        }
        String[] target = new String[length];
        int count = 0;
        for (String[] a : arrays) {
            for (String s : a) {
                target[count] = s;
                count++;
            }
        }
        for (String s : target) {
            System.out.print(s + ", ");
        }
        return target;
    }

    public static void main(String[] args) {
        String[] target = abc(new String[]{"privet", "poka", "ok"}, new String[]{"on", "ona", "oni"});
//        for (String s : args) {
//            for (int i = 0; i < target.length; i++) {
//                if (s.equals(target[i])) {
//                    target[i] = null;
//                }
//            }
//        }

        }
    }

