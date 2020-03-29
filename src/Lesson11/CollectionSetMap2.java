package Lesson11;
import java.util.*;

public class CollectionSetMap2 {
    public static boolean isUnique(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        return new HashSet<String>(map.values()).size() == map.size();
    }
    public static void ex2() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("4", "Four");

        System.out.println("Result : " + CollectionSetMap2.isUnique(map));
    }

    public static void main(String[] args) {
        ex2();
    }
}
