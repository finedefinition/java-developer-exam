package Lesson9;

public class KillObject {
    public int id = 1;
    KillObject(int id) {
        this.id = id;
        System.out.println("Object " + id + " is created");
        System.out.println();
    }
    public static void killObject(KillObject killObject) {
        System.out.println("Object " + killObject.id +  " is deleted");
        killObject = null;
        System.out.println();
    }
    public static void main(String[] args) {
        KillObject k1 = new KillObject(1);
        KillObject k2 = new KillObject(2);
        KillObject k3 = new KillObject(3);
        KillObject k4 = new KillObject(4);
        KillObject k5 = new KillObject(5);
        KillObject k6 = new KillObject(6);
        KillObject k7 = new KillObject(7);
        KillObject k8 = new KillObject(8);
        killObject(k1);
        killObject(k2);
        killObject(k3);
        killObject(k4);
        killObject(k5);
        killObject(k6);
        }
    }

