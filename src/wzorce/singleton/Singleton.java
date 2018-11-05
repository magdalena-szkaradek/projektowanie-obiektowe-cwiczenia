package wzorce.singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }

    public void pisz() {
        System.out.println("Przykladowy tekst");
    }
}
