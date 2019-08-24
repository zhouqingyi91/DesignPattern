package design.pattern2.builder;

public class HighBuildingHouseBuilder extends HouseBuilder {
    @Override
    public void buildRoof() {
        System.out.println("高楼大厦: 玻璃屋顶");
        super.house.setRoof("玻璃屋顶");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼大厦: 10米墙");
        super.house.setWall("10米墙");
    }

    @Override
    public void buildFoundation() {
        System.out.println("高楼大厦: 50米地基");
        super.house.setFoundation("50米地基");
    }
}
