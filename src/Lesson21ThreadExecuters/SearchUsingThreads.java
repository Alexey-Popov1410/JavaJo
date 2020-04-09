package Lesson21ThreadExecuters;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SearchUsingThreads {
    private int[] maxValuesFromThread;
    private final int[] array;

    public SearchUsingThreads(int[] array) {
        this.array = array;
    }

    public int findUsingThreads() {
        FindMaxElementUsingThreads[] findMaximumElementUsingThreads = createThreadObjects();
        maxValuesFromThread = new int[findMaximumElementUsingThreads.length];
        ExecutorService executorService = Executors.newFixedThreadPool(findMaximumElementUsingThreads.length);
        for (FindMaxElementUsingThreads thread : findMaximumElementUsingThreads) {
            executorService.submit(thread);
        }

        while (getMaxValuesArray()[findMaximumElementUsingThreads.length - 1] == 0) {
        }
        int maxInt = 0;
        for (int value : maxValuesFromThread) {
            if (maxInt < value) {
                maxInt = value;
            }
        }
        executorService.shutdown();
        return maxInt;
    }

    private FindMaxElementUsingThreads[] createThreadObjects() {
        FindMaxElementUsingThreads[] findMaximumElementUsingThreads;
        if (array.length < 10) {
            findMaximumElementUsingThreads = new FindMaxElementUsingThreads[array.length];
            for (int i = 0; i < findMaximumElementUsingThreads.length; i++) {
                findMaximumElementUsingThreads[i] = new FindMaxElementUsingThreads(new int[]{array[i]}, this);
            }
        } else {
            findMaximumElementUsingThreads = new FindMaxElementUsingThreads[10];
            int elements = array.length / findMaximumElementUsingThreads.length;
            int delta = array.length % findMaximumElementUsingThreads.length;
            int markForArray = 0;
            for (int i = 0; i < findMaximumElementUsingThreads.length; i++) {
                int[] pieceOfArray;
                if (delta > 0) {
                    pieceOfArray = Arrays.copyOfRange(array, markForArray, markForArray + elements + 1);
                    markForArray += elements + 1;
                    --delta;
                } else {
                    pieceOfArray = Arrays.copyOfRange(array, markForArray, markForArray + elements);
                    markForArray += elements;
                }
                findMaximumElementUsingThreads[i] = new FindMaxElementUsingThreads(pieceOfArray, this);
            }
        }
        return findMaximumElementUsingThreads;
    }

    private synchronized int[] getMaxValuesArray() {
        return maxValuesFromThread;
    }

    public synchronized void setMaxValues(int maxValue) {
        for (int i = 0; i < maxValuesFromThread.length; i++) {
            if (maxValuesFromThread[i] == 0) {
                maxValuesFromThread[i] = maxValue;
                return;
            }
        }
    }
}
