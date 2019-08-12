package com.atguigu.principle.ocp.improve;

/**
 * 根据开闭原则做改进
 * 当需要画新的图案的时候, 只需要对提供方做修改, 不需要动到使用方
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

// 使用方
class GraphicEditor {
    public void drawShape(Shape shape) {
        shape.draw();
    }
}

// 提供方
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {

    void draw() {
        System.out.println("画圆圈");
    }
}

// 新增图形, 三角形
class Triangle extends Shape {

    void draw() {
        System.out.println("画三角形");
    }
}
