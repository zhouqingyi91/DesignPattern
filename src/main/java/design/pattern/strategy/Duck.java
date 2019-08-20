package design.pattern.strategy;

public abstract class Duck {
    FlyStrategy flyStrategy;

    public void fly() {
        if (flyStrategy != null)
            flyStrategy.fly();
    }

    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }
}
