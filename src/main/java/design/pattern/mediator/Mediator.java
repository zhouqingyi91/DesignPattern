package design.pattern.mediator;

/**
 * 中介抽象类
 */
public abstract class Mediator {
    // 将具体同事类加到集合中
    public abstract void register(String colleagueName, Colleague colleague);

    public abstract void getMessage(int stateChange, String colleagueName);

    public abstract void sendMessage();
}
