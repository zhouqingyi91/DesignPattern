package design.pattern2.factory.simplefactory;

public class OrderPizza {
    SimpleFactory simpleFactory;

    public OrderPizza(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public void order(String pizzaName) {
        Pizza pizza = simpleFactory.createPizza(pizzaName);

        if (pizza != null) {
            // 订购成功
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("订购披萨失败");
        }
    }
}
