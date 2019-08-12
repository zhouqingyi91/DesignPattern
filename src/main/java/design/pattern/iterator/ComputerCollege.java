package design.pattern.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {

    Department[] departments;
    int pos = 0;

    public ComputerCollege() {
        departments = new Department[5];
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departments[pos++] = new Department(name, desc);
    }

    @Override
    public Iterator getIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
