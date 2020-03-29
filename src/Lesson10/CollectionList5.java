package Lesson10;
import java.util.*;

public class CollectionList5 {
    public static void main(String[] args) {
        Set<Integer> i1 = new HashSet<>(Arrays.asList(0, 5, 8, 2, 6, 13, 7, 9));
        System.out.println(i1);
        Set<Integer> i2 = new HashSet<>(Arrays.asList(5, 8, 0, 16, 2, 9, 19));
        System.out.println(i2);
        System.out.println("Объединение - " + unification(i1, i2));
        System.out.println("Пересечение - " + intersect(i1, i2));
    }
    public static Set<Integer> unification(Set<Integer> i1, Set<Integer> i2) {
        Set<Integer> set = new HashSet<>(i1);
        set.addAll(i2);
        return set;
    }
    public static Set<Integer> intersect(Set<Integer> i1, Set<Integer> i2) {
        Set<Integer> set = new HashSet<>(i1);
        set.retainAll(i2);
        return set ;
    }
}
