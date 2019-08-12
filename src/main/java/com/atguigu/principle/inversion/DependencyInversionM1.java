package com.atguigu.principle.inversion;

/**
 * 方式1: 通过接口传递实现依赖
 */
public class DependencyInversionM1 {

    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(changHong);
    }

}

/**
 * 开关的接口
 */
interface IOpenAndClose {
    // 抽象方法, 接口接收
    void open(ITV itv);
}

interface ITV {
    void play();
}

class ChangHong implements ITV {

    public void play() {
        System.out.println("打开长虹电视");
    }
}

/**
 * 实现接口
 */
class OpenAndClose implements IOpenAndClose {

    public void open(ITV itv) {
        itv.play();
    }
}

