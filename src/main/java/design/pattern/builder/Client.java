package design.pattern.builder;

public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.buildHouse();
    }
}
