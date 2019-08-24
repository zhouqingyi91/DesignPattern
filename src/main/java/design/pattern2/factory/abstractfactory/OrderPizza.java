package design.pattern2.factory.abstractfactory;

public class OrderPizza {
    AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        this.factory = factory;
    }

    public void order(String pizzaName) {
        Pizza pizza = factory.createPizza(pizzaName);
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
