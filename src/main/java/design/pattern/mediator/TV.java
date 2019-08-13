package design.pattern.mediator;

public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        // 在构造自己的同时, 把自己放入到中介者里的HashMap
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void startTV() {
        System.out.println("it's time to start TV");
    }

    public void stopTV() {
        System.out.println("it's time to stop TV");
    }
}
