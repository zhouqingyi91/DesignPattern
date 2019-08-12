package design.pattern.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    // 需要Department是以怎样的方式存放的 => 数组
    Department[] departments;
    int pos = 0; // 遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    public boolean hasNext() {
        if (pos >= departments.length || departments[pos] == null)
            return false;
        return true;
    }

    public Object next() {
        Department department = departments[pos++];
        return department;
    }

}
