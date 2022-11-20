package Lesson28;

public class Task {


    public static void main(String[] args) {
        Tiger t = new Tiger();

        t.eat("Meat");

        try {
            t.drink("Water");
            try {
                t.drink("Beer");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Its finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class NeMyasoException extends RuntimeException {
    NeMyasoException(String message) {
        super(message);
    }
}

class NeVodaException extends Exception {
    NeVodaException(String message) {
        super(message);
    }
}

class Tiger {
    void eat(String s) throws NeMyasoException {
        if (!s.equalsIgnoreCase("Meat")) {
            throw new NeMyasoException("Tiger don`t eat " + s);
        } else {
            System.out.println("Tiger eat MEAT!!");
        }
    }

    void drink(String s) throws NeVodaException {
        if (!s.equalsIgnoreCase("Water")) {
            throw new NeMyasoException("Tiger don`t drink " + s);
        } else {
            System.out.println("Tiger drink WATER!!");
        }
    }
}

