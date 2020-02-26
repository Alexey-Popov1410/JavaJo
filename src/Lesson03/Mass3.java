package Lesson03;

import java.util.Random;

public class Mass3 {
    public static void main(String[] args){
        double array[] = new double[1000];
        int indexOfMax = 0;
        int indexOfMin = 0;
        Random random = new Random();
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextDouble();
            if (array[i] > array[indexOfMax]){
                indexOfMax = i;
            } else if (array[i] < array[indexOfMin]){
                indexOfMin = i;
            }
        }
        System.out.println("Максимальное значение : " + array[indexOfMax]);
        System.out.println("Минимальное значение : " + array[indexOfMin]);
    }
}

