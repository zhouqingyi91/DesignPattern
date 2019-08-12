package design.pattern.factory.abstractfactory.factory;

import design.pattern.factory.abstractfactory.pizza.LDCheesePizza;
import design.pattern.factory.abstractfactory.pizza.LDOriginalPizza;
import design.pattern.factory.abstractfactory.pizza.LDPepperPizza;
import design.pattern.factory.simplefactory.pizza.Pizza;

public class LDPizzaFactory implements PizzaFactory {
    public Pizza createPizza(String orderType) {
        System.out.println("使用抽象工厂模式");
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        } else {
            pizza = new LDOriginalPizza();
        }
        return pizza;
    }
}
