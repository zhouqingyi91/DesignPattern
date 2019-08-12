package design.pattern.factory.abstractfactory.order;

import design.pattern.factory.abstractfactory.factory.BJPizzaFactory;

public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizzaBJ = new OrderPizza();
        orderPizzaBJ.setFactory(new BJPizzaFactory());

        for (int i = 0; i < 3; i++) {
            orderPizzaBJ.placeOrder();
        }
    }
}
