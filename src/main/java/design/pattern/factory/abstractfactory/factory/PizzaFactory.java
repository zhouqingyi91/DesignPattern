package design.pattern.factory.abstractfactory.factory;

import design.pattern.factory.simplefactory.pizza.Pizza;

/**
 * 抽象工厂模式的抽象层(接口)
 */
public interface PizzaFactory {
    Pizza createPizza(String orderType);
}
