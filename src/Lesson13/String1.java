package Lesson13;

public class String1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("add String: " + addString());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("add StringBuilder: " + addStringBuilder());
        }
    }
    private static long addString() {
        String string = "";
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            string += 1;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    private static long addStringBuilder() {
        StringBuilder sb = new StringBuilder();
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            sb.append(1);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
