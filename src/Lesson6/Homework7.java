package Lesson6;

import Lesson7.Employee;

public class Homework7 {
    public static void main(String[] args) {
        Employee employee = new Employee(23, "Ivanov", 34, 1800, "IT");
        //Employee employee1 = new Employee(24);
        employee.showSalary(employee);

    }
}
