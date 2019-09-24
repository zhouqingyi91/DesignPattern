package design.pattern2.adapter.objectadapter.improve;

/**
 * 中国标准的适配器
 * 把中国标准适配成国际标准
 */
public class ChinaSocketAdapter implements InternationalSocket {

    private ChinaSocket socket;

    public ChinaSocketAdapter(ChinaSocket socket) {
        this.socket = socket;
    }

    @Override
    public void output() {
        socket.output();
    }
}
