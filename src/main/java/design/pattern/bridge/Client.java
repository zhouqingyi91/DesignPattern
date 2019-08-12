package design.pattern.bridge;

public class Client {
    public static void main(String[] args) {
        Phone foldedPhone = new FoldedPhone(new XiaoMi());
        foldedPhone.open();
        foldedPhone.close();
        foldedPhone.call();

        System.out.println("================");

        Phone uprightPhone = new UprightPhone(new Vivo());
        uprightPhone.open();
        uprightPhone.close();
        uprightPhone.call();

        System.out.println("================");

        Phone uprightPhone2 = new UprightPhone(new XiaoMi());
        uprightPhone2.open();
        uprightPhone2.close();
        uprightPhone2.call();

    }
}
