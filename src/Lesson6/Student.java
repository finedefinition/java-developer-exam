package Lesson6;

public class Student {
    Student(int idNumber, String name, String lastName, int year, double averageMath, double averageEconomy,
    double averageLanguage) {
        this.idNumber = idNumber;
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.averageMath = averageMath;
        this.averageEconomy = averageEconomy;
        this.averageLanguage = averageLanguage;
    }
    Student(String name, String lastName, int year) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
    }
    Student () {

    }

    int idNumber;
    String name;
    String lastName;
    int year;
    double averageMath;
    double averageEconomy;
    double averageLanguage;


}

class StudentTest {
    public double getAverageGrade(Student st) {

        double avGrade = (st.averageMath + st.averageEconomy + st.averageLanguage) / 3;
        System.out.println(st.name + " " + st.lastName + " Average grade: " + avGrade);
        return avGrade;
    }
    public static void main(String[] args) {
        Student s1 = new Student(12,"Peter", "Griffin", 1984, 7.5, 4.5, 9.0);
        Student s2 = new Student("David", "Jackson", 1984);
        Student s3 = new Student();

        StudentTest studentTest = new StudentTest();
        studentTest.getAverageGrade(s1);
        studentTest.getAverageGrade(s2);
        studentTest.getAverageGrade(s3);

    }
}

