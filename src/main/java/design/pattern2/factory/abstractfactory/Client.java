package design.pattern2.factory.abstractfactory;

public class Client {
    public static void main(String[] args) {
        AbsFactory ldFactory = new LDFactory();
        OrderPizza orderPizzaLD = new OrderPizza(ldFactory);
        orderPizzaLD.order("cheese");
    }
}
