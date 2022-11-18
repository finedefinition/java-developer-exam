package Lesson24;

public class Mechenosec extends Fish {
    public Mechenosec(String name1, String name2) {
        super(name1,null);
        this.name = name2;
    }
    public void swim() {
        System.out.println("Mechenosec krasivaya riba i ona bistro plavaet!");
    }
    public void eat() {
        System.out.println("Mechenosec ne xishnaya riba ey nujen obichnij korm");
    }
}
