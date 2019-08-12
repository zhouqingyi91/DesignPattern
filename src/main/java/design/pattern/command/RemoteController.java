package design.pattern.command;

/**
 * 命令的发布者
 */
public class RemoteController {

    // 开和关的命令数组 - 数组里的command对象对应的是不同的receiver
    Command[] onCommands;
    Command[] offCommands;

    // 撤销命令
    Command undoCommand;

    // 构造器, 完成对按钮的初始化 - 每个按钮一开始的空能都是空实现
    public RemoteController() {
        undoCommand = new NoCommand();

        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    // 给按钮设置命令
    public void setCommand(int i, Command onCommand, Command offCommand) {
        onCommands[i] = onCommand;
        offCommands[i] = offCommand;
    }

    // 按下开的按钮
    public void pushOnButton(int i) {
        // i是你按的第几个按钮, 每个按钮可以命令不同的执行者
        onCommands[i].execute();

        // 记录这次的操作, 用于撤销
        undoCommand = onCommands[i];
    }

    // 按下关的按钮
    public void pushOffButton(int i) {
        offCommands[i].execute();
        undoCommand = offCommands[i];
    }

    // 按下撤销的按钮
    public void pushUndoButton() {
        undoCommand.undo();
    }


    /**
     * 以内部类的方式实现
     */
    class TVReceiver {
        public void on() {
            System.out.println("打开电视");
        }

        public void off() {
            System.out.println("关闭电视");
        }
    }

    class TVOnCommand implements Command {
        TVReceiver tv;

        public TVOnCommand(TVReceiver tv) {
            this.tv = tv;
        }

        public void execute() {
            tv.on();
        }

        public void undo() {
            tv.off();
        }
    }

    class TVOffCommand implements Command {

        TVReceiver tv;

        public TVOffCommand(TVReceiver tv) {
            this.tv = tv;
        }

        public void execute() {
            tv.off();
        }

        public void undo() {
            tv.on();
        }
    }


}
