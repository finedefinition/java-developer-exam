package Lesson18;

public class Task2 {
    public static void showArray(String[][] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + ", ");
            }
                System.out.print("}, ");
            }
            System.out.println(" }");
        }
    public static void main(String[] args) {
        String [][] array2 = {{"good", "bad", "not bad"},{"white", "black", "violet"}};
        showArray(array2);
    }
}
