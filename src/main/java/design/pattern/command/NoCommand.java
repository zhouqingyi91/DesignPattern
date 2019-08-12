package design.pattern.command;

/**
 * 命令的空实现, 用来初始化的, 省得做非空判断
 */
public class NoCommand implements Command {
    public void execute() {

    }

    public void undo() {

    }
}
