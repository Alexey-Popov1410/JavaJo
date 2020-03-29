package Lesson10;
import java.io.*;

public class CollectionList4Stack {
    private int size;
    private int[] stackArray;
    private int top;

    public CollectionList4Stack(int size) {
        this.size = size;
        stackArray = new int[size];
        top = -1;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int number) {
        stackArray[++top] = number;
    }

    public int pop() {
        return stackArray[top--];
    }

    public static void methodStack() {
        CollectionList4Stack stack = new CollectionList4Stack(0);
        int n = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String s = bufferedReader.readLine();
            stack = new CollectionList4Stack(s.length());
            n = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (n > 0) {
            stack.push(n % 10);
            n /= 10;
        }

        StringBuilder sb = new StringBuilder();
        int value = stack.pop();
        sb.append(value);
        while (!stack.isEmpty()) {
            int v = stack.pop();
            if (value > v) {
                sb.append(v);
                value = v;
            }
        }
        if (sb.length() > 1) {
            System.out.println(sb.toString());
        }
    }
}
