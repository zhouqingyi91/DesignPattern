package design.pattern.factory.abstractfactory.pizza;

import design.pattern.factory.simplefactory.pizza.Pizza;

public class BJPepperPizza extends Pizza {
    public void prepare() {
        setName("北京胡椒pizza");
        System.out.println(name + " prepare;");
    }
}
