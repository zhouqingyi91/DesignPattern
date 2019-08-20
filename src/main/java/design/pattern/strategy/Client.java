package design.pattern.strategy;

public class Client {
    public static void main(String[] args) {
        Duck wildDuck = new WildDuck();
        wildDuck.fly();

        Duck pekingDuck = new PekingDuck();
        pekingDuck.fly();

        pekingDuck.setFlyStrategy(new CantFlyStrategy());
        pekingDuck.fly();
    }
}
