package design.pattern.builder;

public class CommonHouse extends AbstractHouse {
    public void buildFoundation() {
        System.out.println("普通房子打地基");
    }

    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    public void buildRoof() {
        System.out.println("普通房子封顶");
    }
}
