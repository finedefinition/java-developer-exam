package Lesson5;

public class Student {

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
        Student s1 = new Student();
        s1.idNumber = 1023;
        s1.name = "Alice";
        s1.lastName = "Murphy";
        s1.year = 1984;
        s1.averageMath = 5.0;
        s1.averageEconomy = 4.8;
        s1.averageLanguage = 5.0;

        Student s2 = new Student();
        s2.idNumber = 1024;
        s2.name = "Bob";
        s2.lastName = "Heresy";
        s2.year = 1984;
        s2.averageMath = 3.0;
        s2.averageEconomy = 3.8;
        s2.averageLanguage = 3.0;

        Student s3 = new Student();
        s3.idNumber = 1025;
        s3.name = "John";
        s3.lastName = "Heresy";
        s3.year = 1984;
        s3.averageMath = 3.0;
        s3.averageEconomy = 3.9;
        s3.averageLanguage = 4.0;

        StudentTest studentTest = new StudentTest();
        studentTest.getAverageGrade(s1);
        studentTest.getAverageGrade(s2);
        studentTest.getAverageGrade(s3);

    }
}

