package design.pattern.iterator;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {
    List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    // 遍历学院, 然后遍历该学院的系, 打印出来
    public void printCollege() {
        // List已经实现了Iterator
        Iterator<College> iterator = collegeList.iterator();

        while (iterator.hasNext()) {
            College college = iterator.next();
            System.out.println("========" + college.getName() + "========");
            printDepartment(college.getIterator());
        }
    }

    private void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
