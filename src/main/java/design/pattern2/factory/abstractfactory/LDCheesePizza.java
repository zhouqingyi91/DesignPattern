package design.pattern2.factory.abstractfactory;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备伦敦的cheesePizza");
    }
}
