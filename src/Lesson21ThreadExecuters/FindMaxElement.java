package Lesson21ThreadExecuters;

public class FindMaxElement {
    static int[] array;

    public FindMaxElement(int[] array) {
        FindMaxElement.array = array;
    }

    public Integer getMaxElement() {
        int maxInt = 0;
        for (int value : array) {
            if (maxInt < value) {
                maxInt = value;
            }
        }
        return maxInt;
    }
}
