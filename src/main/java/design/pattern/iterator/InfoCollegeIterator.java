package design.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {

    // List方式存放Department
    List<Department> departmentList = new ArrayList<>();
    int index = -1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1)
            return false;
        index++;
        return true;
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }
}
