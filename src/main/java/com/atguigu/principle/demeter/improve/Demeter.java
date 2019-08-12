package com.atguigu.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * 遵循迪米特法则
 */
public class Demeter {
    public static void main(String[] args) {
        CollegeManager collegeManager = new CollegeManager();
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(collegeManager);
    }
}


// 学校的员工类
class SchoolEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 学院的员工类
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 管理学院员工的管理类
class CollegeManager {

    // 返回学院所有的员工
    public List<CollegeEmployee> getAllEmployee() {

        ArrayList<CollegeEmployee> collegeEmployees = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工id = " + i);
            collegeEmployees.add(collegeEmployee);
        }
        return collegeEmployees;
    }

    public void printAllEmployee() {
        List<CollegeEmployee> collegeEmployees = getAllEmployee();
        System.out.println("----学院员工----");
        for (CollegeEmployee collegeEmployee : collegeEmployees) {
            System.out.println(collegeEmployee.getId());
        }
    }
}

// 管理学校员工的管理类
class SchoolManager {
    // 返回学校所有的员工
    public List<SchoolEmployee> getAllEmployee() {
        ArrayList<SchoolEmployee> schoolEmployees = new ArrayList<SchoolEmployee>();
        for (int i = 0; i < 5; i++) {
            SchoolEmployee schoolEmployee = new SchoolEmployee();
            schoolEmployee.setId("学院员工id = " + i);
            schoolEmployees.add(schoolEmployee);
        }
        return schoolEmployees;
    }

    // 输出学校和学院的所有员工
    public void printAllEmployee (CollegeManager collegeManager) {

        collegeManager.printAllEmployee();

        List<SchoolEmployee> schoolEmployees = getAllEmployee();
        System.out.println("----学校员工----");
        for (SchoolEmployee schoolEmployee : schoolEmployees) {
            System.out.println(schoolEmployee.getId());
        }

    }
}