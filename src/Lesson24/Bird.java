package Lesson24;

public abstract class Bird extends Animal implements Speakable {
    public Bird(String name1, String name2) {
        super(name1);
        this.name = name2;
    }

    public abstract void fly();

    public void speak() {
        System.out.println(name + "sings");
    }
}