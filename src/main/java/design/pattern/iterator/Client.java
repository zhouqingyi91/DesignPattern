package design.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        ComputerCollege computerCollege = new ComputerCollege();
        computerCollege.addDepartment("Java专业", "java");
        computerCollege.addDepartment("大数据专业", "大数据");
        computerCollege.addDepartment("PHP专业", "php");

        InfoCollege infoCollege = new InfoCollege();
        infoCollege.addDepartment("信息安全", "信息");
        infoCollege.addDepartment("网络安全", "网络");
        infoCollege.addDepartment("服务器安全", "服务器");

        List<College> collegeList = new ArrayList<>();

        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutputImpl output = new OutputImpl(collegeList);
        output.printCollege();
    }
}
