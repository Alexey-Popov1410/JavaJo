package Lesson03;

import java.util.Random;

public class Mass4 {
    public static void main(String[] args){
        int array[] = new int[3];
        Random random = new Random();
        for (int i = 0; i < array.length ; i++) {
            array[i] = (10 + random.nextInt(89));
            System.out.println(array[i]);
        }
        boolean increase = true;
        for (int i = 1; i < array.length ; i++)
            if (array[i] <= array[i-1]) {
                increase = false;
                break;
            }
        if (increase) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}