package design.pattern2.singleton;

public class Enum {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
    }
}

enum Singleton {
    INSTANCE;

    public void someMethod() {
        System.out.println("put method here");
    }
}
