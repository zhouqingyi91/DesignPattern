package design.pattern2.decorator;

public class SoyMilk extends Decorator {
    public SoyMilk(Drink obj) {
        super(obj);
        setDes("豆奶");
        setPrice(3.0f);
    }
}
