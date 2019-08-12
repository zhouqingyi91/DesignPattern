package design.pattern.factory.abstractfactory.order;

import design.pattern.factory.abstractfactory.factory.PizzaFactory;
import design.pattern.factory.simplefactory.pizza.Pizza;
import design.pattern.factory.utils.Utils;

public class OrderPizza {
    PizzaFactory factory;

    public void setFactory(PizzaFactory factory) {
        this.factory = factory;
    }

    public void placeOrder() {
        String pizzaType = Utils.getType();
        Pizza pizza = factory.createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("下单完成~");
    }
}
