package com.atguigu.principle.inversion;

/**
 * 通过构造方法依赖传递
 */
public class DependencyInversionM2 {
    public static void main(String[] args) {
        XiaoMi xiaoMi = new XiaoMi();
        OpenAndClose2 openAndClose = new OpenAndClose2(xiaoMi);
        openAndClose.open();

    }
}

interface IOpenAndClose2 {
    // 抽象方法
    void open();
}

interface ITV2 {
    void play();
}

class OpenAndClose2 implements IOpenAndClose2 {

    public ITV2 itv;

    public void open() {
        this.itv.play();
    }

    public OpenAndClose2(ITV2 itv) {
        this.itv = itv;
    }
}

class XiaoMi implements ITV2 {

    public void play() {
        System.out.println("打开小米电视");
    }
}
