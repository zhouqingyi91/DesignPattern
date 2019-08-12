package design.pattern.bridge.test;

public class Vivo extends Brand {

    public Vivo(Phone phone) {
        super(phone);
    }

    public void open() {
        super.open();
        System.out.println("vivo手机");
    }

    public void close() {
        super.close();
        System.out.println("vivo手机");
    }

    public void call() {
        super.call();
        System.out.println("vivo手机");
    }
}
