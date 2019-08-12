package design.pattern.singleton.type8;

public class Enum {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

/**
 * 枚举
 */
enum Singleton {
    INSTANCE;

    public void someMethod() {
        System.out.println("some method...");
    }
}
