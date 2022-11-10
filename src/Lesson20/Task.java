package Lesson20;

import java.util.ArrayList;
import java.util.Collections;


public class Task {
    public static ArrayList<String> abc(String ... args) {
       ArrayList<String> result = new ArrayList<>();
       for (String a : args) {
           result.add(a);
       }
        Collections.sort(result);

       System.out.println(result);
       return result;
    }

    public static void main(String[] args) {
        abc("Sergii", "Andrii", "Oleg", "Ivan", "Jhonny");
    }

}
