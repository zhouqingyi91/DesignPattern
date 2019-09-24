package design.pattern2.adapter.objectadapter.improve;

public class Client {
    public static void main(String[] args) {
        ChinaSocket chinaSocket = new ChinaSocket();
        ChinaSocketAdapter chinaSocketAdapter = new ChinaSocketAdapter(chinaSocket);
        InternationalHotel hotel = new InternationalHotel(chinaSocketAdapter);
        hotel.charge();

        System.out.println("===============");

        GermanySocket germanySocket = new GermanySocket();
        GermanySocketAdapter germanySocketAdapter = new GermanySocketAdapter(germanySocket);
        hotel.setSocketAdapter(germanySocketAdapter);
        hotel.charge();
    }
}
