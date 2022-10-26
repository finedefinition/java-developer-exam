package Lesson7;

public class Employee {

    public String surname;
    int id;
    int age;
    double salary;
    String department;

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    Employee(int id) {
        this.id = id;
    }

    private Employee(int age, String department) {
        this.age = age;
        this.department = department;
    }

    double doubleSalary(double salary) {

        return salary * 2;
    }

    public void showSurname(Employee employee) {
        System.out.println("Surname " + employee.surname);
    }

    public void showSalary(Employee employee) {
        System.out.println("Salary " + employee.salary);
    }

    void showId(Employee employee) {
        System.out.println("ID " + employee.id);
    }


}

class EmployeeTest {

    public static void main(String[] args) {
        Employee e1 = new Employee(24, "Lennon", 19, 1900.00, "IT");
        Employee e2 = new Employee(25, "Shannon", 30, 2100.00, "PR");
        e1.showSurname(e1);
        e1.showSalary(e1);
        e1.showId(e1);
        e1.showSurname(e2);
        e1.showSalary(e2);
        e1.showId(e2);
    }
}

