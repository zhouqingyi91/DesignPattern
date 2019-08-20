package design.pattern.strategy;

public class PekingDuck extends Duck {
    public PekingDuck() {
        flyStrategy = new BadFlyStrategy();
    }
}
