package design.pattern2.template;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("制作红豆豆浆");
        SoyMilk redBeanSoyMilk = new RedBeanSoyMilk();
        redBeanSoyMilk.make();

        System.out.println("====================");
        System.out.println("制作纯豆浆");
        SoyMilk pureSoyMilk = new PureSoyMilk();
        pureSoyMilk.make();
    }
}
