package design.pattern.strategy;

import java.util.Arrays;
import java.util.Comparator;

public class Sourcecode {
    public static void main(String[] args) {
        Integer[] data = {9, 2, 5, 3, 7, 8};

        Arrays.sort(data);
        System.out.println(Arrays.toString(data));

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2)
                    return -1;
                else
                    return 1;
            }
        };

        Arrays.sort(data, comparator);
        System.out.println(Arrays.toString(data));

    }
}
