package design.pattern.bridge.test;

public abstract class Brand {
    private Phone phone;

    public Brand(Phone phone) {
        this.phone = phone;
    }

    protected void open() {
        phone.open();
    }

    protected void close() {
        phone.close();
    }

    protected void call() {
        phone.call();
    }
}
