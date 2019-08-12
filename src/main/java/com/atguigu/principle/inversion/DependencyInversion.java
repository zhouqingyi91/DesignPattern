package com.atguigu.principle.inversion;

interface IReceiver {
    String getInfo();
}

public class DependencyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new WeChat());
        person.receive(new Email());
    }

}

class WeChat implements IReceiver {

    public String getInfo() {
        return "WeChat message";
    }
}

class Email implements IReceiver {
    public String getInfo() {
        return "Email message";
    }
}

class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}
