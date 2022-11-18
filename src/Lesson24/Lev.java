package Lesson24;

public class Lev extends Mammal {
    public Lev(String name1, String name2) {
        super(name1,null);
        this.name = name2;
    }
    public void eat() {
        System.out.println("Kak luboi khishnik lev lyubit myaso");
    }
    public void sleep() {
        System.out.println("Bolshuyu chast dnya lev spit");
    }

    @Override
    public void run() {
        System.out.println("Lev eto ne samaja bistraya koshka");
    }
}