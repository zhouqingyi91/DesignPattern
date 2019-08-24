package design.pattern2.factory.abstractfactory;

// 一个抽象工厂模式的抽象层(接口)
public interface AbsFactory {
    // 由子类来具体实现
    public Pizza createPizza(String pizzaName);
}


// 子类工厂的具体实现
class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String pizzaName) {
        Pizza pizza = null;
        switch (pizzaName) {
            case "cheese":
                pizza = new LDCheesePizza();
                pizza.setName(pizzaName);
                break;
            case "pepper":
                pizza = new LDPepperPizza();
                pizza.setName(pizzaName);
                break;
        }
        return pizza;
    }
}
