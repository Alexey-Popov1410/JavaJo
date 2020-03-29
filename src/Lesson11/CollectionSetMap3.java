package Lesson11;
import java.util.*;

public class CollectionSetMap3 {
    public static String sumPolynomials(Map<Integer, Integer> map1, Map<Integer, Integer> map2) {
        for (Map.Entry<Integer, Integer> m1 : map1.entrySet()) {
            for (Map.Entry<Integer, Integer> m2 : map2.entrySet()) {
                if (m1.getKey().equals(m2.getKey())) {
                    map1.put(m1.getKey(), m1.getValue() + m2.getValue());
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Integer, Integer> m : map1.entrySet()) {
            builder.append(m.getKey()).append("^x").append(m.getValue()).append("+");
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.reverse();
        return builder.toString();
    }
    public static void ex3() {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        map1.put(3, 8);
        map1.put(7, 1);
        map1.put(6, 4);
        map1.put(5, 9);

        map2.put(8, 3);
        map2.put(3, 7);
        map2.put(5, 2);
        map2.put(7, 9);

        System.out.println(CollectionSetMap3.sumPolynomials(map1, map2));
    }

    public static void main(String[] args) {
        ex3();
    }
}
