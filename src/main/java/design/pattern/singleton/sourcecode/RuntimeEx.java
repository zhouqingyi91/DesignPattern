package design.pattern.singleton.sourcecode;

public class RuntimeEx {
    public static void main(String[] args) {

        // java源代码里用单例模式创建的单例对象
        Runtime runtime = Runtime.getRuntime();
        Runtime runtime2 = Runtime.getRuntime();

        System.out.println(runtime == runtime2);
        System.out.println(runtime.hashCode());
        System.out.println(runtime2.hashCode());
    }
}
