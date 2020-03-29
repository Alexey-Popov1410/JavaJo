package Lesson11;
import java.util.*;

public class CollectionSetMap1 {
    public static int countUnique(List<Integer> list) {
        if (list == null) {
            return 0;
        }
        Set<Integer> set = new HashSet<>(list);
        return set.size();
    }
    public static void ex1() {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(3);
        list.add(6);
        list.add(8);
        System.out.println(CollectionSetMap1.countUnique(list));
    }

    public static void main(String[] args) {
       ex1();
    }
}
