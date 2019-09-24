package design.pattern2.adapter.objectadapter;

public class Client {
    public static void main(String[] args) {
        DeGuoHotel deGuoHotel = new DeGuoHotel();
        DBSocketAdapter dbSocketAdapter = new DBSocketAdapter(new GBSocket());
        deGuoHotel.setDbSocket(dbSocketAdapter);
        deGuoHotel.charge();
    }
}
