package design.pattern2.template;

/**
 * 其中一个子类
 */
public class RedBeanSoyMilk extends SoyMilk {
    @Override
    public void addCondiment() {
        System.out.println("加入红豆配料");
    }
}
