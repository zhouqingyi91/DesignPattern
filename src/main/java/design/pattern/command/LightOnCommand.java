package design.pattern.command;

/**
 * 具体的命令 - 开灯
 */
public class LightOnCommand implements Command {

    // 执行命令的对象
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
