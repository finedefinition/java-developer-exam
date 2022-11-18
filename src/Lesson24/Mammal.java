package Lesson24;

public abstract class Mammal extends Animal implements Speakable {
    public Mammal(String name1, String name2) {
        super(name1);
        this.name = name2;
    }
    public abstract void run();
}