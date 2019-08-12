package design.pattern.factory.sourcecode;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        /**
         * Calendar就是一个CalendarFactory, 用的是简单工厂模式
         */
        Calendar instance = Calendar.getInstance();
    }
}
