package Lesson30.homework;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    int salary;
    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

}

class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Eugen", "IT", 2600);
        Employee e6 = new Employee("Elena", "IT", 3600);
        Employee e2 = new Employee("Mark", "Mark", 1600);
        Employee e3 = new Employee("Oleg", "Mark", 2000);
        Employee e4 = new Employee("Sergii", "IT", 5000);
        Employee e5 = new Employee("Zaur", "IT", 1600);
        ArrayList<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        TestEmployee te = new TestEmployee();
        te.filtrationEmployee(list, e -> e.salary > 2000);
        te.filtrationEmployee(list, e -> (e.name.charAt(0) == 'E') && (e.salary != 2600));
        te.filtrationEmployee(list, e -> e.name.equals(e.department));

    }

   public void filtrationEmployee(ArrayList<Employee> al, Predicate<Employee> t) {
        for (Employee e : al) {
            if (t.test(e)) {
                printEmployee(e);
            }
        }
        System.out.println("________________________________________");
    }
    void printEmployee(Employee e) {
        System.out.println("Name: " + e.name + "  Department: " + e.department + "  Salary: " + e.salary);
    }

}