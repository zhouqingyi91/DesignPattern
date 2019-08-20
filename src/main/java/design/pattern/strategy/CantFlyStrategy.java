package design.pattern.strategy;

public class CantFlyStrategy implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
