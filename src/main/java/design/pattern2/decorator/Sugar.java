package design.pattern2.decorator;

public class Sugar extends Decorator {
    public Sugar(Drink obj) {
        super(obj);
        setDes("糖");
        setPrice(1.0f);
    }
}
