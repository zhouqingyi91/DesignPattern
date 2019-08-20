package design.pattern.strategy;

public class GoodFlyStrategy implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("飞得很好");
    }
}
