package design.pattern2.builder;

public class Director {
    HouseBuilder houseBuilder;

    // 构造方式传入HouseBuilder
    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // setter方式传入也可以
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House buildHouse() {
        houseBuilder.buildFoundation();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
        return houseBuilder.buildHouse();
    }
}
