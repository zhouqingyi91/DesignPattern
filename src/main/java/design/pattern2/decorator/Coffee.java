package design.pattern2.decorator;

/**
 * ConcreteComponent - 具体的主体
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
