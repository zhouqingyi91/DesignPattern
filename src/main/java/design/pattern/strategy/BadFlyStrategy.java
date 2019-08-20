package design.pattern.strategy;

public class BadFlyStrategy implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("飞得很差");
    }
}
