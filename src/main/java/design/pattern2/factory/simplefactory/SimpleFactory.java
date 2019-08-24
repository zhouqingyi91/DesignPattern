package design.pattern2.factory.simplefactory;

public class SimpleFactory {
    public static Pizza createPizza(String pizzaName) {
        Pizza pizza = null;

        switch (pizzaName) {
            case "cheese":
                pizza = new CheesePizza();
                pizza.setName(pizzaName);
                break;
            case "pepper":
                pizza = new PepperPizza();
                pizza.setName(pizzaName);
                break;
        }

        return pizza;
    }
}
