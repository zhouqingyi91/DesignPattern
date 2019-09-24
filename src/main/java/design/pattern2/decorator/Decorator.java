package design.pattern2.decorator;

/**
 * 装饰类 - 含有一个被装饰的对象Drink obj
 */
public class Decorator extends Drink {

    private Drink obj; // 聚合

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        return des + " = " + getPrice() + " && " + obj.getDes();
    }
}
