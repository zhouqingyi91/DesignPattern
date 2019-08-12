package design.pattern.command;

public class Client {
    public static void main(String[] args) {
        LightReceiver light = new LightReceiver();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("--------按下撤销的按钮-----------");
        remoteController.pushUndoButton();
        System.out.println("--------按下灯的关按钮-----------");
        remoteController.pushOffButton(0);
        System.out.println("--------按下灯的开按钮-----------");
        remoteController.pushOnButton(0);
        System.out.println("--------按下撤销的按钮-----------");
        remoteController.pushUndoButton();

        System.out.println("=========使用遥控器操作电视机==========");

        RemoteController.TVReceiver tvReceiver = remoteController.new TVReceiver();

        RemoteController.TVOnCommand tvOnCommand = remoteController.new TVOnCommand(tvReceiver);
        RemoteController.TVOffCommand tvOffCommand = remoteController.new TVOffCommand(tvReceiver);

        remoteController.setCommand(1, tvOnCommand, tvOffCommand);

        System.out.println("--------按下电视的开按钮-----------");
        remoteController.pushOnButton(1);
        System.out.println("--------按下电视的关按钮-----------");
        remoteController.pushOffButton(1);
        System.out.println("--------按下撤销的按钮-----------");
        remoteController.pushUndoButton();
    }
}
