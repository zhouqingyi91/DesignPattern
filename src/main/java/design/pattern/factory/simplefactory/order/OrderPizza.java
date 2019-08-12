package design.pattern.factory.simplefactory.order;

import design.pattern.factory.simplefactory.pizza.Pizza;
import design.pattern.factory.utils.Utils;

public class OrderPizza {

    // 定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType = ""; // 用户输入的
        this.simpleFactory = simpleFactory; // 设置简单工厂对象

        while(true) {
            orderType = Utils.getType();
            pizza = this.simpleFactory.createPizza(orderType);

            // 输出pizza
            if (pizza != null) {
                // 订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
                break;
            }
        }
    }
}
