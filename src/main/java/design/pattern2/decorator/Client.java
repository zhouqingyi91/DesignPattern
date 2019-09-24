package design.pattern2.decorator;

public class Client {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        order = new Sugar(order);

        System.out.println(order.cost());
        System.out.println(order.getDes());

        System.out.println("========================");

        order = new SoyMilk(order);
        System.out.println(order.cost());
        System.out.println(order.getDes());

        System.out.println("=======================");

        order = new SoyMilk(order);
        System.out.println(order.cost());
        System.out.println(order.getDes());

        System.out.println("========================");

        Drink order2 = new Latte();
        order2 = new Sugar(order2);
        System.out.println(order2.cost());
        System.out.println(order2.getDes());
    }
}
