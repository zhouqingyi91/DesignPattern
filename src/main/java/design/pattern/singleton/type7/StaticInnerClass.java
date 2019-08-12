package design.pattern.singleton.type7;

public class StaticInnerClass {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

/**
 * 静态内部类
 */
class Singleton {
    private Singleton() {}

    private static class StaticSingleton {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return StaticSingleton.INSTANCE;
    }
}
