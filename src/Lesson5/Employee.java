package Lesson5;

public class Employee {

    int id;
    String surname;

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    int age;
    double salary;
    String department;




    double doubleSalary(double salary) {

        return salary * 2;
    }
}

    class EmployeeTest {

        public static void main(String[] args) {
            Employee e1 = new Employee(24, "Lennon", 19, 1900.00, "IT");
            Employee e2 = new Employee(25, "Shannon", 30, 2100.00, "PR");

            System.out.println(e2.surname + " Old salary: " + e2.salary + " New salary: " + e2.doubleSalary(e2.salary));

        }
    }

