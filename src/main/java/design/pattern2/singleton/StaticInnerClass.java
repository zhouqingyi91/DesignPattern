package design.pattern2.singleton;

public class StaticInnerClass {

    private StaticInnerClass() {}

    private static class SingletonInstance {
        private static final StaticInnerClass instance = new StaticInnerClass();
    }

    public StaticInnerClass getInstance() {
        return SingletonInstance.instance;
    }
}
