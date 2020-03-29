package Lesson10;
import java.util.*;

public class Students {
    private List<Student> students;
    private List<Integer> listRating;

    public Students(List<Student> students) {
        this.students = students;
        listRating = new ArrayList<>(students.size());
    }

    public void addRandomGrades() {
        ListIterator<Integer> listIterator = listRating.listIterator();
        for (int i = 0; i < 10; i++) {
            double d = (Math.random() * 10) + 1;
            listIterator.add((int) d);
        }
    }

    public void removeBadGrades() {
        listRating.removeIf(integer -> integer < 6);
    }

    public void printListRating() {
        for (Integer integer : listRating) {
            System.out.println(integer);
        }
    }

    public Integer getMaxGrade() {
        ListIterator<Integer> listIterator = listRating.listIterator();
        int maxValue = 0;
        while (listIterator.hasNext()) {
            Integer value = listIterator.next();
            if (maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;
    }


    public void printListReverse1() {
        ListIterator<Student> listIterator = students.listIterator(students.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous().toString());
        }
    }

    public void printListReverse2() {
        for (int i = students.size() - 1; i >= 0; i--) {
            System.out.println(students.get(i));
        }
    }
}
