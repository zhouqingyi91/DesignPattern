package design.pattern2.builder;

public abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildRoof();
    public abstract void buildWall();
    public abstract void buildFoundation();

    public House buildHouse() {
        return house;
    }
}
