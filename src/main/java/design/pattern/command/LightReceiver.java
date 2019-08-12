package design.pattern.command;

/**
 * 命令执行者
 */
public class LightReceiver {
    public void on() {
        System.out.println("开电灯");
    }
    public void off() {
        System.out.println("关电灯");
    }
}
