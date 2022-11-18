package Lesson25;

public class Animal {
    static String a = "Static variable base class";

    static {
        a += " + static initializer";
        System.out.println(a + "      ////1 loop");
    }

    String a1 = "Non- static variable base class";

    {
        a += " + non static initializer";
        a1 += " + non static initializer";
        System.out.println(a + "      ////2 loop");
        System.out.println(a1 + "      ////2a loop");

    }


    public Animal(String a1) {
        this.a1 = a1;
        a += "+ constructor changes ";
        a1 += "+ constructor changes ";
        System.out.println(a + "      ////CONSTRUCTOR BASE CLASS loop");
        System.out.println(a1 + "      ////CONSTRUCTOR BASE CLASS loop");
    }

    static void abc() {
        a += "+ static method base class changes ";
        System.out.println(a + "      ////5 loop");
    }

    void def() {
        a += "+ non static method base class changes";
        a1 += "+ non static method base class changes";
        System.out.println(a + "      ///6 loop");
        System.out.println(a1 + "      ////7 loop");
    }

    static class Pet1 extends Animal {
        static String a = "Static variable child class";

        static {
            System.out.println("Static initializer child class");
        }

        String a1 = "Non- static variable child class";

        {
            System.out.println("Non - Static initializer child class");
        }

        Pet1(String a) {
            super(a);
            a += "+ Constructor child class with static variable";
            System.out.println(a);

        }

        static void abc() {
            a += "+ static method child class changes";
            System.out.println("Static method child class");

        }

        void def() {
            a += "+ non static method child class changes";
            System.out.println(a);

        }

    }

    static class Test {
        public static void main(String[] args) {

            Animal animal1 = new Animal("PARAMETR");
            System.out.println(animal1.a + "      ////PRINT AFTER loop");
            System.out.println(animal1.a1 + "      ////PRINT AFTER loop");

            animal1.abc();
            animal1.def();

            Animal animalpet1 = new Pet1("AnimalPet");
            System.out.println(animalpet1.a);
            System.out.println(Animal.a);

            animalpet1.abc();
            Pet1.abc();
            animalpet1.def();


            Pet1 pet = new Pet1("Pettttt");
            System.out.println(pet.a);



//            System.out.println(pet.a1);

        }
    }

}
