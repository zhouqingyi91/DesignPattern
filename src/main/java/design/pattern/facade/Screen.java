package design.pattern.facade;

public class Screen {

    private Screen() {}

    private static class StaticScreen {
        private static final Screen INSTANCE = new Screen();
    }

    public static Screen getInstance() {
        return StaticScreen.INSTANCE;
    }

    public void up() {
        System.out.println("screen up");
    }

    public void down() {
        System.out.println("screen down");
    }
}
