package Lesson24;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        Mechenosec m = new Mechenosec("Animal", "Mechenosec");
        System.out.println(m.name);
        m.eat();
        m.swim();
        m.sleep();
        Speakable s = new Pingvin("Animal", "Pingvi");
        s.speak();
        Mammal a = new Lev("Animal", "Lev");
        System.out.println(a.name);
        a.eat();
        a.sleep();
        a.run();
        a.speak();





    }
}
