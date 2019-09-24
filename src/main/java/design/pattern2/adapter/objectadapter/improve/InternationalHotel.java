package design.pattern2.adapter.objectadapter.improve;

/**
 * 使用者
 */
public class InternationalHotel {

    private InternationalSocket socket;

    public InternationalHotel(InternationalSocket socket) {
        this.socket = socket;
    }

    public void setSocketAdapter(InternationalSocket socket) {
        this.socket = socket;
    }

    public void charge() {
        socket.output();
    }
}
