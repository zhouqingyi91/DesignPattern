package com.atguigu.principle.segregation;

public class SegregationDemo {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        C c = new C();
        c.depend1(a);
        c.depend2(a);
        c.depend3(a);

        D d = new D();
        d.depend1(b);
        d.depend4(b);
        d.depend5(b);
    }

}

interface Interface1 {
    void operation1();
}

interface Interface2 {
    void operation2();

    void operation3();
}

interface Interface3 {
    void operation4();

    void operation5();
}

class A implements Interface1, Interface2 {

    public void operation1() {
        System.out.println("A 实现了operation1");
    }

    public void operation2() {
        System.out.println("A 实现了operation2");
    }

    public void operation3() {
        System.out.println("A 实现了operation3");
    }
}

class B implements Interface1, Interface3 {

    public void operation1() {
        System.out.println("B 实现了operation1");
    }

    public void operation4() {
        System.out.println("B 实现了operation4");
    }

    public void operation5() {
        System.out.println("B 实现了operation5");
    }
}

class C {
    void depend1(Interface1 i1) {
        i1.operation1();
    }

    void depend2(Interface2 i2) {
        i2.operation2();
    }

    void depend3(Interface2 i2) {
        i2.operation3();
    }
}

class D {
    void depend1(Interface1 i1) {
        i1.operation1();
    }

    void depend4(Interface3 i3) {
        i3.operation4();
    }

    void depend5(Interface3 i3) {
        i3.operation5();
    }
}








