package com.atguigu.principle.ocp;

/**
 * 开闭原则
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}

class GraphicEditor {
    // 接受shape对象, 然后根据不同的type来画图
    // 这么做的问题在于之后要画新的图案的时候, 需要在原有的代码的基础上做修改, 不好维护
    public void drawShape(Shape shape) {
        if (shape.m_type == 1) {
            drawCircle(shape);
        } else if (shape.m_type == 2) {
            drawRectangle(shape);
        }
    }

    private void drawRectangle(Shape shape) {
        System.out.println("画矩形");
    }

    private void drawCircle(Shape shape) {
        System.out.println("画圆圈");
    }


}

abstract class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 2;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 1;
    }
}
