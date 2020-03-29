package Lesson11;
import java.util.*;

public class BlackBox implements Comparator<Integer> {
    private List<Integer> list = new ArrayList<>();

    @Override
    public int compare(Integer i1, Integer i2) {
        return i2 - i1;
    }

    public void addNumber(int number) {
        list.add(number);
        Collections.sort(list);
    }

    public Integer getMinElement(int n) {
        if (n > 0 && n <= list.size()) {
            return list.get(n - 1);
        } else {
            System.out.println("Неверный номер минимального элемента");
            return null;
        }
    }

    public Integer getMaxElement(int n) {
        if (n > 0 && n <= list.size()) {
            return list.get(list.size() - n);
        } else {
            System.out.println("Неверный номер максимального элемента");
            return null;
        }
    }
    public static void ex4() {
        BlackBox blackBox = new BlackBox();
        blackBox.addNumber(5);
        blackBox.addNumber(2);
        blackBox.addNumber(7);
        blackBox.addNumber(4);
        blackBox.addNumber(8);
        blackBox.addNumber(1);

        System.out.println(blackBox.getMinElement(2));
        System.out.println(blackBox.getMaxElement(2));
    }

    public static void main(String[] args) {
        ex4();
    }
}
