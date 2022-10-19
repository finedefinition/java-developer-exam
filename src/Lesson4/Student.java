package Lesson4;

public class Student {
    int idNumber;
    String name;
    String lastName;
    int year;
double averageMath;
double averageEconomy;
double averageLanguage;

static int NUMBER_OF_SUBJECTS = 3;
}

class StudentTest {
    static int NUMBER_OF_SUBJECTS = 3;
    public static void main(String[] args) {
        Student Alice = new Student();
        Alice.idNumber = 1023;
        Alice.name = "Alice";
        Alice.lastName = "Murphy";
        Alice.year = 1984;
        Alice.averageMath = 5.0;
        Alice.averageEconomy = 4.8;
        Alice.averageLanguage = 5.0;

        Student Bob = new Student();
        Bob.idNumber = 1024;
        Bob.name = "Bob";
        Bob.lastName = "Heresy";
        Bob.year = 1984;
        Bob.averageMath = 3.0;
        Bob.averageEconomy = 3.8;
        Bob.averageLanguage = 3.0;

        Student John = new Student();
        John.idNumber = 1025;
        John.name = "Bob";
        John.lastName = "Heresy";
        John.year = 1984;
        John.averageMath = 3.0;
        John.averageEconomy = 3.8;
        John.averageLanguage = 3.0;

        System.out.println(Alice.name + " Average grade " + (Alice.averageMath + Alice.averageEconomy +
        Alice.averageLanguage) / NUMBER_OF_SUBJECTS);
        System.out.println(Bob.name + " Average grade " + (Bob.averageMath + Bob.averageEconomy +
                Bob.averageLanguage) / NUMBER_OF_SUBJECTS);
        System.out.println(John.name + " Average grade " + (John.averageMath + Alice.averageEconomy +
                Alice.averageLanguage) / NUMBER_OF_SUBJECTS);
    }
}

