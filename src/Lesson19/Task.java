package Lesson19;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
public class Solution {
    public static void main(String[] args) {
        String packagePath = "java/util.stream/src|main";
        String[] tokens = getTokens(packagePath, "/.,");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {

        String[] result  = new String[tokenizer.countTokens()];
        for (int i = 0; i < result.length; i++) {
            result[i] = tokenizer.nextToken();
        }

        return result;
    }
}
 */
public class Task {
    public static String[] abc(String[]... args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length; j++) {
                builder.append(i + "/");
            }
        }
        String middle = new String(builder);
        StringTokenizer tokenizer = new StringTokenizer(middle, "/");
        String[] result  = new String[tokenizer.countTokens()];
        for (int i = 0; i < result.length; i++) {
            result[i] = tokenizer.nextToken();
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        abc(args);

    }
}
