package design.pattern.factory.abstractfactory.pizza;

import design.pattern.factory.simplefactory.pizza.Pizza;

public class LDOriginalPizza extends Pizza {
    public void prepare() {
        setName("伦敦原味pizza");
        System.out.println(name + " prepare;");
    }
}
