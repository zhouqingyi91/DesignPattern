package design.pattern.singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {

    }
}

/**
 * 双重检查
 */
class Singleton {
    private Singleton() {
    }

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
