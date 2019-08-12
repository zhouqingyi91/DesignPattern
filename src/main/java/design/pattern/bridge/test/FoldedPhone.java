package design.pattern.bridge.test;

public class FoldedPhone implements Phone {
    public void open() {
        System.out.println("折叠手机开机");
    }

    public void close() {
        System.out.println("折叠手机关机");
    }

    public void call() {
        System.out.println("折叠手机打电话");
    }
}
