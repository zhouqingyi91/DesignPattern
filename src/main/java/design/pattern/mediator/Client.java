package design.pattern.mediator;

public class Client {
    public static void main(String[] args) {
        // 创建中介者对象
        Mediator concreteMediator = new ConcreteMediator();

        // 创建TV并且加入到ConcreteMediator对象的HashMap
        TV tv = new TV(concreteMediator, "TV");

        /**
         * 中介者模式 - 智能家庭的操作流程
         * 1) 创建concreteMediator对象
         * 2) 创建各个同事类对象, 比如: TV, Alarm, CoffeeMachine
         * 3) 在创建同事类对象的时候, 就直接通过构造器, 加入到concreteMediator的HashMap里
         * 4) 同事类对象, 调用sendMessage方法, 最终会去调用concreteMediator的getMessage方法
         * 5) getMessage方法会根据接收到的同事对象发出的信息来协调调用其他的同事对象 (处理复杂的业务逻辑)
         */
    }
}
