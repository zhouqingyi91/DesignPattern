package design.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sourcecode {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        Iterator<Object> iterator = list.iterator();
        Object next = iterator.next();
    }
}
