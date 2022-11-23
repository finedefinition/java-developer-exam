package Lesson30.lambda;

import java.util.ArrayList;

public class Sort {
}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double averageGrade;

    public Student(String name, char sex, int age, int course, double averageGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.averageGrade = averageGrade;
    }
}

class StudentInfo {
    void testStudents(ArrayList<Student> al, StudentCheck sc) {
for (Student s : al) {
    if (sc.test(s)) {
        printStudent(s);
    }
}
        System.out.println("________________________________________");
    }
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student s2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student s3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student s4 = new Student("Petr", 'm', 35, 4, 7);
        Student s5 = new Student("Mariya", 'f', 23, 3, 9.1);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        StudentInfo si = new StudentInfo();
//        si.testStudents(list, (Student s) -> {return s.averageGrade > 8.5;});
//        si.testStudents(list, (Student s) -> {return s.averageGrade < 8.5;});
//        si.testStudents(list, (Student s) -> {return s.sex == 'm';});
//        si.testStudents(list, (Student s) -> {return s.sex == 'f';});
//        si.testStudents(list, (Student s) -> {return s.course >= 2;});
//        si.testStudents(list, s -> s.course >= 2);
        si.testStudents(list, s -> s.course < 4 && s.sex == 'f');
        si.testStudents(list, ser -> ser.course < 4 && ser.sex == 'f');

    }

    void printStudent(Student student) {
        System.out.println("Student{" +
                "name='" + student.name + '\'' +
                ", sex=" + student.sex +
                ", age=" + student.age +
                ", course=" + student.course +
                ", averageGrade=" + student.averageGrade +
                "}");

    }
}
interface StudentCheck {
    boolean test(Student s);
}
