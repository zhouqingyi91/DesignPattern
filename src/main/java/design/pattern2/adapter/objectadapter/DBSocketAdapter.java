package design.pattern2.adapter.objectadapter;

/**
 * 适配器
 */
public class DBSocketAdapter implements DBSocket {

    private GBSocket gbSocket;

    public DBSocketAdapter(GBSocket gbSocket) {
        this.gbSocket = gbSocket;
    }

    @Override
    public void output() {
        gbSocket.output();
    }
}
