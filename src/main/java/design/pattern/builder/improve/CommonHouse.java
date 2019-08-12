package design.pattern.builder.improve;

/**
 * 具体的建造者(实例)
 */
public class CommonHouse extends HouseBuilder {
    public void buildFoundation() {
        super.house.setFoundation("5米深");
        System.out.println("普通房子打地基");
    }

    public void buildWalls() {
        super.house.setWalls("10厘米厚");
        System.out.println("普通房子砌墙");
    }

    public void buildRoof() {
        super.house.setRoof("木屋顶");
        System.out.println("普通房子封顶");
    }
}
