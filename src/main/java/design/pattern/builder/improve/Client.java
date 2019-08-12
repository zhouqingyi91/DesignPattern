package design.pattern.builder.improve;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {

        // 该普通房子
        HouseBuilder commonHouse = new CommonHouse();
        // 准备创建房子的指挥官
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        // 完成房子的建造, 返回产品(房子)
        House house = houseDirector.buildHouse();

        // 看看房子的数值
        System.out.println(house.getFoundation());
        System.out.println(house.getRoof());
        System.out.println(house.getWalls());

        System.out.println("=========================");

        houseDirector.setHouseBuilder(new HighBuilding());
        House highBuilding = houseDirector.buildHouse();
        System.out.println(highBuilding.getFoundation());
        System.out.println(highBuilding.getRoof());
        System.out.println(highBuilding.getWalls());
    }
}
