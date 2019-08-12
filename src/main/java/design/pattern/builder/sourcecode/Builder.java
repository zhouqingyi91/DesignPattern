package design.pattern.builder.sourcecode;

public class Builder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("hello, world");
        System.out.println(stringBuilder);

        // StringBuilder相当于指挥官和具体的建造者 -- 建造方法的实现是由AbstractStringBuilder完成
        // AbstractStringBuilder相当于建造者(但是不能实例化) -- 实现了Appendable接口方法
        // Appendable相当于抽象的建造者 -- 定义了多个append方法(抽象方法)
    }
}
