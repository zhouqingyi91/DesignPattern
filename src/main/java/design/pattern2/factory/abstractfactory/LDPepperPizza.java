package design.pattern2.factory.abstractfactory;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备伦敦的pepperPizza");
    }
}
