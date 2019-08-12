package design.pattern.factory.abstractfactory.pizza;

import design.pattern.factory.simplefactory.pizza.Pizza;

public class LDPepperPizza extends Pizza {
    public void prepare() {
        setName("伦敦胡椒pizza");
        System.out.println(name + " prepare;");
    }
}
