package design.pattern.mediator;

import java.util.HashMap;

public class ConcreteMediator extends Mediator {

    // 集合, 放入所有的同事对象
    private HashMap<String, Colleague> colleagueMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);
    }

    /**
     * 具体中介者的核心方法
     * 1) 根据传入不同的消息, 完成对应的任务
     * 2) 中介者在这个方法里, 协调各个具体的同事对象, 完成任务
     * @param stateChange
     * @param colleagueName
     */
    @Override
    public void getMessage(int stateChange, String colleagueName) {

    }

    @Override
    public void sendMessage() {

    }
}
