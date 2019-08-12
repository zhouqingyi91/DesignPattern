package design.pattern.template;

public abstract class SoyMilk {

    public final void make() {
        select();
        if (addCondiment())
            addCondiments();
        soak();
        beat();
    }

    public void select() {
        System.out.println("挑选豆");
    }

    // 添加不同的配料, 抽象方法, 子类具体实现
    public abstract void addCondiments();

    public void soak() {
        System.out.println("浸泡");
    }

    public void beat() {
        System.out.println("打碎");
    }

    // 钩子方法
    public boolean addCondiment() {
        return true;
    }

}
