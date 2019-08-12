package design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite
 */
public class University extends OrganizationComponent {

    // 这里面存放的是College
    List<OrganizationComponent> organizationComponentList = new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    // print方法就是输出University包含的学院
    @Override
    protected void print() {
        System.out.println("----------" + getName() + "----------");
        // 遍历organizationComponentList
        for (OrganizationComponent organizationComponent : organizationComponentList) {
            // 这里调用的是college的print方法
            organizationComponent.print();
        }
    }
}
