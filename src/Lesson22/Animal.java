package Lesson22;

public class Animal {
    private int eyes;

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
    private int tail = 1;
    private int paw = 4;

    public int getPaw() {
        return paw;
    }

    public void setPaw(int paw) {
        this.paw = paw;
    }



    public Pet() {
        System.out.println("I am Pet");
        setEyes(2);
    }

    public static void run() {
        System.out.println("Pet run");
    }

    public static void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {
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
}

class Test {
    public static void main(String[] args) {
        Dog d = new Dog("Buxter");
        System.out.println(d.getPaw());
        Cat c = new Cat("Puffy");
        c.sleep();
    }
}
