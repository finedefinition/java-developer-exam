package Lesson22;

public class Animal {
    static int eyes = 2;

    public Animal() {
        System.out.println("I am animal");
    }

    public static void eat() {
        System.out.println("Animal eat");
    }

    public static void drink() {
        System.out.println("Animal drink");
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
}

class Pet extends Animal {
    static int eyes = 3;
    private int tail = 1;
    private int paw = 4;

    public int getPaw() {
        return paw;
    }

    public void setPaw(int paw) {
        this.paw = paw;
    }
    public static void eat() {
        System.out.println("Pet eat");
    }


    public Pet() {
        System.out.println("I am Pet");
        setEyes(2);
    }

    public static void run() {
        System.out.println("Pet run");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {
    static int eyes = 4;
    private String name;

    public Dog(String name) {
        setName(name);
        System.out.println("I am dog & my name is: " + name);
    }

    public static void play() {
        System.out.println("Dog plays");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void eat() {
        System.out.println("Dog eat");
    }
}

class Cat extends Pet {
    private String name;

    public Cat(String name) {
        setName(name);
        System.out.println("I am cat & my name is: " + name);
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void eat() {
        System.out.println("Cat eat");
    }
}

class Test {
    public static void main(String[] args) {
//        Dog d = new Dog("Buxter");
//        System.out.println(d.getPaw());
//        Cat c = new Cat("Puffy");
//        c.sleep();
Animal a = new Animal();
Animal a1 = new Pet();
Animal a2 = new Dog("Noobie");
Pet p1 = new Pet();
Pet p2 = new Dog("Mokk");
Dog d = new Dog("oll");
//        System.out.println(a.eyes);
//        System.out.println(a1.eyes);
//        System.out.println(a2.eyes);
//        System.out.println(p1.eyes);
//        System.out.println(p2.eyes);
//        System.out.println(d.eyes);

        a.eat(); //"Animal eat"
        a1.eat();//"Pet eat"
        a2.eat();//"Dog eat"
        p1.eat();//"Pet eat"
        p2.eat();//"Dog eat"
        d.eat();//"Dog eat"




    }
}
