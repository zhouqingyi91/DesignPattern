package design.pattern.factory.simplefactory.order;

import design.pattern.factory.simplefactory.pizza.CheesePizza;
import design.pattern.factory.simplefactory.pizza.PepperPizza;
import design.pattern.factory.simplefactory.pizza.Pizza;

/**
 * 简单工厂类
 */
public class SimpleFactory {

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName(" 胡椒披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        }

        return pizza;
    }

    // 用静态方法的话就变成静态工厂模式
    public static Pizza createPizzaStatic(String orderType) {
        Pizza pizza = null;

        System.out.println("使用静态工厂模式");
        if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName(" 胡椒披萨 ");
        }

        return pizza;
    }
}
