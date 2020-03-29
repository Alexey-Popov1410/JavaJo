package Lesson10;
import java.util.*;

public class CollectionList7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-13, 42, 65, -316, -18, 10, -36, 59, 0, -210, 3, -85));
        System.out.println(list);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
