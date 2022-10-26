package Lesson7;

public class NewClass {
    public static void main(String[] args) {
        Employee employee = new Employee(23, "Ivanov", 34, 1800, "IT");
        Employee employee1 = new Employee(24);
        employee.showId(employee);
    }
}
