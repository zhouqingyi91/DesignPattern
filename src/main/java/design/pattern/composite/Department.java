package design.pattern.composite;

public class Department extends OrganizationComponent {

    /*
    没有集合,
    add, remove 也不用重写
    因为是叶子节点
     */

    public Department(String name, String des) {
        super(name, des);
    }

    protected void print() {
        // 打印出自己department的名字即可
        System.out.println(getName());
    }



    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }
}
