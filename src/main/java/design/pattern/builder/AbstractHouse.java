package design.pattern.builder;

/**
 *
 * 产品(房子)和建造流程写在了一起, 形成了强耦合
 * 使得产品的建造变得不够灵活
 */
public abstract  class AbstractHouse {

    // 打地基
    public abstract void buildFoundation();

    // 砌墙
    public abstract void buildWalls();

    // 封顶
    public abstract void buildRoof();

    // 建房子
    public void buildHouse() {
        buildFoundation();
        buildWalls();
        buildRoof();
    }

}
