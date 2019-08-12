package design.pattern.factory.abstractfactory.pizza;

import design.pattern.factory.simplefactory.pizza.Pizza;

public class BJCheesePizza extends Pizza {
    public void prepare() {
        setName("北京奶酪pizza");
        System.out.println(name + " prepare;");
    }
}
