package Lesson24;

public class Pingvin extends Bird {
    public Pingvin(String name1, String name2) {
        super(name1,null);
        this.name = name2;
    }
    public void eat() {
        System.out.println("Pingvini lyubyat est ribu");
    }
    public void sleep() {
        System.out.println("Pingvini spyat prizhavshis drug k drugu");
    }
    public void fly() {
        System.out.println("Pingvini ne umeyut letat");
    }
    public void speak() {
        System.out.println("Pingvini ne umeyut pet kaka solovi");
    }
}