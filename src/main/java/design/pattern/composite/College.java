package design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {

    // 这个list里存放的是Department
    List<OrganizationComponent> organizationComponentList = new ArrayList<OrganizationComponent>();

    public College(String name, String des) {
        super(name, des);
    }

    protected void print() {
        System.out.println("--------" + getName() + "--------");
        for (OrganizationComponent organizationComponent : organizationComponentList) {
            // 这里调用的是department的print方法
            organizationComponent.print();
        }
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
}
