package design.pattern.strategy;

public class WildDuck extends Duck {
    public WildDuck() {
        flyStrategy = new GoodFlyStrategy();
    }
}
