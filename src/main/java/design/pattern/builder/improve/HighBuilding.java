package design.pattern.builder.improve;

public class HighBuilding extends HouseBuilder {
    public void buildFoundation() {
        super.house.setFoundation("100米深");
        System.out.println("高楼打地基");
    }

    public void buildWalls() {
        super.house.setWalls("50厘米厚");
        System.out.println("高楼砌墙");
    }

    public void buildRoof() {
        super.house.setRoof("玻璃屋顶");
        System.out.println("高楼封顶");
    }
}
