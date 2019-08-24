package design.pattern2.builder;

public class Client {
    public static void main(String[] args) {
        HouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        HouseBuilder highBuildingHouseBuilder = new HighBuildingHouseBuilder();

        Director director = new Director(commonHouseBuilder);
        House commonHouse = director.buildHouse();
        System.out.println(commonHouse.toString());
        System.out.println("============================================");

        director.setHouseBuilder(highBuildingHouseBuilder);
        House highBuilding = director.buildHouse();
        System.out.println(highBuilding.toString());
    }
}
