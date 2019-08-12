package design.pattern.command;

/**
 * 命令接口
 */
public interface Command {
    void execute();

    void undo();
}
