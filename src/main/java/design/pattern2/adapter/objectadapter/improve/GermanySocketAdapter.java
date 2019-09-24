package design.pattern2.adapter.objectadapter.improve;

/**
 * 德国标准适配器
 * 把德国标准适配成国际标准
 */
public class GermanySocketAdapter implements InternationalSocket {

    private GermanySocket socket;

    public GermanySocketAdapter(GermanySocket socket) {
        this.socket = socket;
    }

    @Override
    public void output() {
        socket.output();
    }
}
