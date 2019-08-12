package design.pattern.singleton.type4;

public class SingletonTest04 {
}

/**
 * 懒汉式, 同步方法
 */
class Singleton {
    private Singleton () {}

    private static Singleton singleton;

    public synchronized static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}