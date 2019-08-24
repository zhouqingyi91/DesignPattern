package design.pattern2.factory.simplefactory;

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备pepperPizza");
    }
}
