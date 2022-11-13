package Lesson22;
/*

 */
public class Student {

    private StringBuilder name;
    private int course;
    private int grade;


    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course > 0 && course < 5) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade < 11) {
            this.grade = grade;
        }
    }


    public void showInfo(Student s) {
        System.out.println("Name is: " + s.getName());
        System.out.println("Course is: " + s.getCourse());
        System.out.println("Grade is: " + s.getGrade());
    }
}
    class StudentTest {
        public static void main(String[] args) {
            Student s1 = new Student();
            s1.setName(new StringBuilder("Ivan"));
            s1.setCourse(3);
            s1.setGrade(10);
            s1.showInfo(s1);
        }
    }
