package Lesson21ThreadExecuters;

public class FindMaxElementUsingThreads implements Runnable {
    int[] array;
    SearchUsingThreads searchUsingThreads;

    public FindMaxElementUsingThreads(int[] array, SearchUsingThreads searchUsingThreads) {
        this.array = array;
        this.searchUsingThreads = searchUsingThreads;
    }

    @Override
    public void run() {
        int maxInt = 0;
        for (int value : array) {
            if (maxInt < value) {
                maxInt = value;
            }
        }
        System.out.println(maxInt + " " + Thread.currentThread().getName());
        searchUsingThreads.setMaxValues(maxInt);
    }
}
