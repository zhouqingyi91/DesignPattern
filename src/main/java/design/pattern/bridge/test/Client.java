package design.pattern.bridge.test;

public class Client {
    public static void main(String[] args) {
        XiaoMi xiaoMi = new XiaoMi(new FoldedPhone());
        xiaoMi.open();
        xiaoMi.close();
        xiaoMi.call();

        System.out.println("================");
        Brand vivo = new Vivo(new FoldedPhone());
        vivo.open();
        vivo.close();
        vivo.call();
    }
}
