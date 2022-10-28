package Lesson11;

public class Car {
    public String color;
    public String Engine;
    public int doors;

    public Car(String color, String engine, int doors) {
        this.color = color;
        Engine = engine;
        this.doors = doors;
    }


}

class CarTest {

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car = new Car("red", "V6", 2);
        Car car2 = new Car("gold", "V8", 3);
        ct.changeDoors(car, 5);
        System.out.println();
        ct.changeColor(car, car2);
        System.out.println();

    }

    void changeDoors(Car car, int a) {

        System.out.println("Doors in car: " + car.doors);
        car.doors = a;
        System.out.println("Doors amount was changed");
        System.out.println("New doors amount: " + a);
    }

    void changeColor(Car a, Car b) {
        System.out.println("First car color is " + a.color);
        System.out.println("Second car color is " + b.color);
        String c = a.color;
        a.color = b.color;
        b.color = c;
        System.out.println("Color was changed....");
        System.out.println("First car color is " + a.color);
        System.out.println("Second car color is " + b.color);
    }
}
