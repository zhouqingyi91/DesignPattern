package design.pattern.facade;

/**
 * 外观类
 */
public class HomeTheaterFacade {
    // 定义各个子系统对象, 在这里初始化或者在构造器里初始化都可以
    private TheaterLight theaterLight = new TheaterLight();
    private Popcorn popcorn = new Popcorn();
    private Stereo stereo = Stereo.INSTANCE;
    private Projector projector = new Projector();
    private Screen screen = Screen.getInstance();
    private DVDPlayer dvdPlayer = DVDPlayer.getInstance();

    // 构造器
//    public HomeTheaterFacade() {
//        super();
//        this.theaterLight = new TheaterLight();
//        this.popcorn = new Popcorn();
//        this.stereo = Stereo.INSTANCE;
//        this.projector = new Projector();
//        this.screen = Screen.getInstance();
//        this.dvdPlayer = DVDPlayer.getInstance();
//    }

    // 操作分成4步
    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
