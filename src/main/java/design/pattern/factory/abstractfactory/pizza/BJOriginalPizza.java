package design.pattern.factory.abstractfactory.pizza;

import design.pattern.factory.simplefactory.pizza.Pizza;

public class BJOriginalPizza extends Pizza {
    public void prepare() {
        setName("北京原味pizza");
        System.out.println(name + " prepare;");
    }
}
