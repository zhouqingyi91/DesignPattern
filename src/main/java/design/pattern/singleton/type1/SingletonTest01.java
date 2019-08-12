package design.pattern.singleton.type1;

public class SingletonTest01 {

}

/**
 * 饿汉式
 */
class Singleton {

    // 1. 私有化构造器
    private Singleton () {}

    // 2. 在本类内部创建对象实例
    private static final Singleton instance = new Singleton();

    // 3. 提供一个公有的静态方法, 返回实例
    public static Singleton getInstance() {
        return instance;
    }

}
