package design.pattern2.template;

/**
 * 运用了钩子方法的子类
 */
public class PureSoyMilk extends SoyMilk {
    @Override
    public void addCondiment() {
    }

    @Override
    public boolean wantCondiment() {
        // 纯豆浆, 不加配料
        return false;
    }
}
