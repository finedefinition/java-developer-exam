package Lesson12;

public class Student {
    String name;
    int course;
    double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void compareNestedIf(Student a, Student b) {

        if (a.name.equals(b.name)) {
            if (a.course == b.course) {
                if (a.grade == b.grade) {
                    System.out.println("Students names, courses and grades are equal");
                } else {
                    System.out.println("Student names, courses are equal. But grades are not equal");
                }
            } else {
                System.out.println("Student names are equal. But curses are not equal");
            }
        } else {
            System.out.println("Student names are not equal");
        }
    }

    static class StudentTest {
        public static void main(String[] args) {
            StudentTest t = new StudentTest();
            Student st1 = new Student("Stepan", 2, 12.0);
            Student st2 = new Student("Ivan", 3, 12.0);
            //t.compareIf(st1, st2);
            compareNestedIf(st1, st2);
        }

        public void compareIf(Student a, Student b) {
            if (a.name.equals(b.name))
                System.out.println("Student names are equal");
            else if (!a.name.equals(b.name))
                System.out.println("Student names are not equal");
            if (a.course == b.course)
                System.out.println("Student curses are equal");
            else if (a.course != b.course)
                System.out.println("Student curses are not equal");
            if (a.grade == b.grade)
                System.out.println("Student grades are equal");
            else if (a.grade != b.grade)
                System.out.println("Student grades are not equal");
        }
    }
}
