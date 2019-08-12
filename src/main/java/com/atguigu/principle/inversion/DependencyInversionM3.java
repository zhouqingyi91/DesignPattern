package com.atguigu.principle.inversion;

/**
 * 通过setter方法进行依赖传递
 */
public class DependencyInversionM3 {
    public static void main(String[] args) {
        ITV3 apple = new Apple();
        IOpenAndClose3 openAndClose3 = new OpenAndClose3();

        openAndClose3.setTV(apple);
        openAndClose3.open();
    }
}

interface IOpenAndClose3 {
    // 抽象方法
    void open();

    void setTV(ITV3 itv3);
}

interface ITV3 {
    void play();
}

class OpenAndClose3 implements IOpenAndClose3 {

    public ITV3 itv3;

    public void open() {
        itv3.play();
    }

    public void setTV(ITV3 itv3) {
        this.itv3 = itv3;
    }
}

class Apple implements ITV3 {

    public void play() {
        System.out.println("打开苹果电视");
    }
}


