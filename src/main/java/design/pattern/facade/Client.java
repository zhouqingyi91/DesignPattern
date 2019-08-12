package design.pattern.facade;

public class Client {
    public static void main(String[] args) {
        // 如果直接调用子类太麻烦了, 所以加了一层抽象类, 我们调用抽象类就好
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        System.out.println("==================");
        homeTheaterFacade.play();
        System.out.println("==================");
        homeTheaterFacade.end();
        System.out.println("==================");
    }
}
