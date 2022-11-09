package Lesson18;

import java.util.Arrays;

public class Task {
    public static int[] sorting(int[] array) {
        for (int start = 1; start < array.length; start++) { // start going through forward array
            int work = array[start]; //save work variable  - 2
            int i = start - 1; // new int for sorting out
            for (; i >= 0; i--) { //reverse sorting to the start
                if (work < array[i]) { // 2 < 10
                    array[i + 1] = array[i]; // if work less then iterator value work initialized by value
                } else {
                    break;
                }
            } // !!! i--;
            array[i + 1] = work;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        int[] array2 = new int[]{10, 7, -2, 3, 0, 78, 6, 19, 10};
        int[] array = {10, 2, 66, 17, 81, 27, 5};
        System.out.println(Arrays.toString(array));
        sorting(array);
        System.out.println(Arrays.toString(array2));
        sorting(array2);
    }
}