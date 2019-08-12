package design.pattern.bridge;

public class Vivo implements Brand {
    public void open() {
        System.out.println("Vivo手机开机");
    }

    public void close() {
        System.out.println("Vivo手机关机");
    }

    public void call() {
        System.out.println("Vivo手机打电话");
    }
}
