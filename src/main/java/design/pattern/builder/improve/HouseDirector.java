package design.pattern.builder.improve;

/**
 * 指挥官
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    // 构造器传入builder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // set方法传入builder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 如何处理建造房子的流程, 交给指挥官
    public House buildHouse() {
        houseBuilder.buildFoundation();
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        return houseBuilder.buildHouse();
    }
}
