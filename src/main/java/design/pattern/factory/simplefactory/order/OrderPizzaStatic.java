package design.pattern.factory.simplefactory.order;

import design.pattern.factory.simplefactory.pizza.Pizza;
import design.pattern.factory.utils.Utils;

public class OrderPizzaStatic {
    Pizza pizza = null;
    String orderType = "";

    public OrderPizzaStatic() {

        while (true) {
            orderType = Utils.getType();
            pizza = SimpleFactory.createPizzaStatic(orderType);

            // 输出pizza
            if (pizza != null) {
                // 订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
        }


    }

}
