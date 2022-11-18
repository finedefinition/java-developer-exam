package Lesson24;

public abstract class Fish extends Animal {
    public Fish(String name1, String name2) {
        super(name1);
        this.name = name2;
    }
    public abstract void swim();
    public void sleep() {
        System.out.println("Всегда интересно наблюдать как спят рыбы");
    }

}