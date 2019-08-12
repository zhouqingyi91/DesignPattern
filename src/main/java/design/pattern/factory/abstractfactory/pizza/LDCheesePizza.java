package design.pattern.factory.abstractfactory.pizza;

import design.pattern.factory.simplefactory.pizza.Pizza;

public class LDCheesePizza extends Pizza {
    public void prepare() {
        setName("伦敦奶酪pizza");
        System.out.println(name + " prepare;");
    }
}
