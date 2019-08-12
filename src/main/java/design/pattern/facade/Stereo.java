package design.pattern.facade;

enum Stereo {

    INSTANCE;

    public void up() {
        System.out.println("stereo up");
    }

    public void down() {
        System.out.println("stereo down");
    }

    public void on() {
        System.out.println("stereo on");
    }

    public void off() {
        System.out.println("stereo off");
    }
}
