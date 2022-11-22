package Lesson30.standartsort;

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
        si.printStudentBySex(list, 'm');
        si.printStudentBySex(list, 'f');
        si.printStudentMixConditions(list,6,56,'m');
        si.printStudentOverAge(list, 25);
        si.printStudentUnderAge(list, 36);


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

    void printStudentOverGrade(ArrayList<Student> al, double averageGrade) {
        for (Student s : al) {
            if (s.averageGrade > averageGrade) {
                printStudent(s);
            }
        }
        System.out.println("--------------------------------------");
    }

    void printStudentUnderGrade(ArrayList<Student> al, double averageGrade) {
        for (Student s : al) {
            if (s.averageGrade < averageGrade) {
                printStudent(s);
            }
        }
        System.out.println("--------------------------------------");
    }

    void printStudentOverAge(ArrayList<Student> al, int age) {
        for (Student s : al) {
            if (s.age > age) {
                printStudent(s);
            }
        }
        System.out.println("--------------------------------------");
    }

    void printStudentUnderAge(ArrayList<Student> al, int age) {
        for (Student s : al) {
            if (s.age < age) {
                printStudent(s);
            }
        }
        System.out.println("--------------------------------------");
    }

    void printStudentBySex(ArrayList<Student> al, char sex) {
        for (Student s : al) {
            if (s.sex == sex) {
                printStudent(s);
            }
        }
        System.out.println("--------------------------------------");
    }

    void printStudentMixConditions(ArrayList<Student> al, double averageGrade, int age, char sex) {
        for (Student s : al) {
            if (s.averageGrade > averageGrade && s.age < age && s.sex == sex) {
                printStudent(s);
            }
        }
        System.out.println("--------------------------------------");
    }
}
