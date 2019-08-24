package design.pattern2.factory.simplefactory;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备cheesePizza");
    }
}
