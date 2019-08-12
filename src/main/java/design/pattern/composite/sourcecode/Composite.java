package design.pattern.composite.sourcecode;

import java.util.HashMap;
import java.util.Map;

public class Composite {
    public static void main(String[] args) {

        Map<Integer, String> hashmap = new HashMap<Integer, String>();
        hashmap.put(0, "东游记"); // 直接存放叶子节点(Node)

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(null, "西游记"); // 直接存放叶子节点(Node)
        map.put(2, "红楼梦"); // 直接存放叶子节点(Node)

        hashmap.putAll(map);
        System.out.println(hashmap);
        System.out.println(map.containsKey(null));

        String remove = map.remove(null);
        System.out.println(remove);
    }
}
