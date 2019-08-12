package design.pattern.bridge.test;

public class XiaoMi extends Brand {
    public XiaoMi(Phone phone) {
        super(phone);
    }

    public void open() {
        super.open();
        System.out.println("小米手机");
    }

    public void close() {
        super.close();
        System.out.println("小米手机");
    }

    public void call() {
        super.call();
        System.out.println("小米手机");
    }
}
