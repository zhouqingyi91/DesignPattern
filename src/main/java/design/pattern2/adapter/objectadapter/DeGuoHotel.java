package design.pattern2.adapter.objectadapter;

/**
 * 使用者
 */
public class DeGuoHotel {
    private DBSocket dbSocket;

    public void setDbSocket(DBSocket dbSocket) {
        this.dbSocket = dbSocket;
    }

    public void charge() {
        // 看起来像是用了德标充电, 但其实是通过了适配器, 用国标充电
        // 通过适配器将GBSocket适配成DBSocket
        dbSocket.output();
    }
}
