package Lesson24;

public abstract class Animal {
    public String name;

    public Animal(String name) {
        name = "Animal";
    }

    public abstract void eat();

    public abstract void sleep();
}

