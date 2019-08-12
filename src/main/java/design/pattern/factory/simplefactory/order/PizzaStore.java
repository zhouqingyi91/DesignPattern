package design.pattern.factory.simplefactory.order;

/**
 * 相对于一个客户端, 发出订购
 */
public class PizzaStore {
    public static void main(String[] args) {
//        SimpleFactory simpleFactory = new SimpleFactory();
//        new OrderPizza(simpleFactory);

        new OrderPizzaStatic();
    }
}
