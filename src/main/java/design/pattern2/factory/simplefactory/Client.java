package design.pattern2.factory.simplefactory;

public class Client {
    public static void main(String[] args) {
        SimpleFactory pizzaFactory = new SimpleFactory();
        OrderPizza orderPizza = new OrderPizza(pizzaFactory);
        orderPizza.order("cheese");
    }
}
