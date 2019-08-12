package design.pattern.composite;

public class Client {
    public static void main(String[] args) {

        OrganizationComponent university = new University("清华大学", "中国顶级大学");

        OrganizationComponent computerCollege = new College("计算机学院", "计算机");
        OrganizationComponent infoCollege = new College("信息学院", "信息");

        computerCollege.add(new Department("软件工程", "软件"));
        computerCollege.add(new Department("网络工程", "网络"));
        computerCollege.add(new Department("计算机科学与技术", "科学"));

        infoCollege.add(new Department("通信工程", "通信"));
        infoCollege.add(new Department("信息工程", "信息"));

        university.add(computerCollege);
        university.add(infoCollege);

//        university.print();
        infoCollege.print();
    }
}
