package design.pattern2.template;

/**
 * 抽象类, 定义了模板方法
 */
public abstract class SoyMilk {
    // 模板方法 - 定义了算法的流程
    public final void make() {
        select();
        soak();

        if (wantCondiment())
            addCondiment();

        beat();
    }

    public void select() {
        System.out.println("挑选黄豆");
    }

    public void soak() {
        System.out.println("浸泡黄豆");
    }

    // 抽象方法 - 子类实现
    public abstract void addCondiment();

    public void beat() {
        System.out.println("将黄豆和配料打碎");
    }

    // 钩子方法
    public boolean wantCondiment() {
        return true;
    }
}
