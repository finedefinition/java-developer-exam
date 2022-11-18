package Lesson25;

import Lesson10.p1.A;

public class Animal {
    static String a = "SVBC"; //Static variable base class
    String a1 = "NSVBC"; //Non- static variable base class

    static { //Static initializer base class
        a += " + SIBC";
        System.out.println(a + " //Static initializer base class");
    }

    { //non static initializer
        a += " + NSIBC";
        a1 += " + NSIBC";
        System.out.println(a + " //Non-Static initializer base class");
        System.out.println(a1 + " //Non-Static initializer base class");

    }

    public Animal(String a1) { //CONSTRUCTOR BASE CLASS
        this.a1 = a1;
        a += " + CBC ";
        a1 += " + CBC ";
        System.out.println(a + "//CONSTRUCTOR BASE CLASS");
        System.out.println(a1 + "//CONSTRUCTOR BASE CLASS");
    }

    static void abc() { // Static method base class
        a += " + SMBC ";
        System.out.println(a + " //Static method BASE CLASS");
    }

    void def() { // Non static method base class
        a += " + NSMBC";
        a1 += " + NSMBC";
        System.out.println(a + " //Non - Static method BASE CLASS");
        System.out.println(a1 + " //Non - Static method BASE CLASS");
    }

    static class Pet1 extends Animal {
        static String a = " + SVCC"; //Static variable child class
        String a1 = "NSVCC";//Non- static variable child class
        static { // Static initializer child class
            a += " + SICC";
            System.out.println(a + " //      SVCC       // Static initializer child class");
        }
        { //Non - Static initializer child class
            a += " + NSICC";
            a1 += " + NSICC";
            System.out.println(a + " //       SVCC      // Non- Static initializer child class");
            System.out.println(a1 + " //       NSVCC      // Non- Static initializer child class");
        }

        Pet1(String a) { //Constructor child class
            super(a);
            Pet1.a += " + CCC";
            Animal.a += " + CCC";
            a += " + CCC";
            a1 += " + CCC";
            System.out.println(Animal.a + " //     SVBC      // Constructor child class");
            System.out.println(a + " //     NSVCC        // Constructor child class");
            System.out.println(a1 + " //     NSVCC       // Constructor child class");
        }

        static void abc() { //static method child class
            Animal.a += " + SMCC";
            a += " + SMCC";
            System.out.println(a + " //       SVCC      // Static method child class");
            System.out.println(Animal.a + " //     SVBC        // Static method child class");
        }

        void def() { //non static method child class
            a += " + NSMCC";
            Animal.a += " + NSMCC";
            System.out.println(a  + " //      SVCC       // Non - Static method child class");
            System.out.println(Animal.a + " //     SVBC        // Non - Static method child class");
        }
    }

    static class Test {
        public static void main(String[] args) {

            Animal animal1 = new Animal("PARAMETR");

            System.out.println(Animal.a + "    // SVBC ////PRINT AFTER loop");
            System.out.println(animal1.a + "    // SVBC ////PRINT AFTER loop");
            System.out.println(animal1.a1 + "  //  NSVBC  ////PRINT AFTER loop");
//
            animal1.abc();
            animal1.def();

           Animal animalpet1 = new Pet1("AnimalPet");
            System.out.println(Animal.a + "    // SVBC ////PRINT AFTER CHILD loop");
            System.out.println(animalpet1.a + "    // HIDE !!! SVCC ////PRINT AFTER CHILD loop");
            System.out.println(animalpet1.a1 + "  //  instanse variables  ////PRINT AFTER CHILd loop");
            System.out.println(Pet1.a + "  //  SVCC  ////PRINT AFTER CHILd loop");

            animalpet1.abc(); //HIDE METHOD
            System.out.println("HIDE METHOD UP!!");
            animalpet1.def();

            Pet1 pet = new Pet1("Pettttt");
            pet.abc();
            pet.def();
            System.out.println(pet.a1);
            System.out.println(pet.a);
            System.out.println(animal1.a1);
            System.out.println(animal1.a);
            System.out.println(animalpet1.a);
            System.out.println(animalpet1.a1);

        }
    }

}
