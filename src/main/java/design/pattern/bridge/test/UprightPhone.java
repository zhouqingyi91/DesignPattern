package design.pattern.bridge.test;

public class UprightPhone implements Phone {
    public void open() {
        System.out.println("直立手机开机");
    }

    public void close() {
        System.out.println("直立手机关机");
    }

    public void call() {
        System.out.println("直立手机打电话");
    }
}
