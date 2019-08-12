package design.pattern.factory.abstractfactory.factory;

import design.pattern.factory.abstractfactory.pizza.BJCheesePizza;
import design.pattern.factory.abstractfactory.pizza.BJOriginalPizza;
import design.pattern.factory.abstractfactory.pizza.BJPepperPizza;
import design.pattern.factory.simplefactory.pizza.Pizza;

public class BJPizzaFactory implements PizzaFactory {
    public Pizza createPizza(String orderType) {
        System.out.println("使用抽象工厂模式");
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        } else {
            pizza = new BJOriginalPizza();
        }

        return pizza;
    }
}
