package design.pattern2.builder;

public class CommonHouseBuilder extends HouseBuilder {
    @Override
    public void buildRoof() {
        System.out.println("普通房子: 木屋顶");
        super.house.setRoof("木屋顶");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子: 3米墙");
        super.house.setWall("3迷墙");
    }

    @Override
    public void buildFoundation() {
        System.out.println("普通房子: 10米地基");
        super.house.setFoundation("10米地基");
    }
}
