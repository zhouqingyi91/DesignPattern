package design.pattern2.prototype;

public class Client {
    public static void main(String[] args) {
        Sheep tom = new Sheep("tom", 20);
        Sheep tomClone = (Sheep) tom.clone();

        System.out.println(tom);
        System.out.println(tomClone);

        System.out.println("tom.hashCode = " + tom.hashCode());
        System.out.println("tomClone.hashCode = " + tomClone.hashCode());
    }
}
