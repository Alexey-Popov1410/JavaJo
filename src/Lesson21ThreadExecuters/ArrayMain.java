package Lesson21ThreadExecuters;

public class ArrayMain {
    private static final int MAX_ARRAY_SIZE = 500;

    private static final int[] array = randomIntArray();

    public static void main(String[] args) {
        SearchUsingThreads searchUsingThreads = new SearchUsingThreads(array);
        long timeThreadsStart = System.nanoTime();
        int maxElementUsingThreads = searchUsingThreads.findUsingThreads();
        long timeThreadsEnd = System.nanoTime();
        System.out.println("Результат с потоками : " + maxElementUsingThreads);
        System.out.println("Время : " + (timeThreadsEnd - timeThreadsStart));

        FindMaxElement findMaximumElement = new FindMaxElement(array);
        long timeNormalStart = System.nanoTime();
        int maxElement = findMaximumElement.getMaxElement();
        long timeNormalEnd = System.nanoTime();
        System.out.println("Результат без потоков : " + maxElement);
        System.out.println("Время : " + (timeNormalEnd - timeNormalStart));
    }

    private static int[] randomIntArray() {
        int[] array;
        array = new int[MAX_ARRAY_SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 300) + 1;
        }
        return array;
    }
}
