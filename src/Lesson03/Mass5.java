package Lesson03;
import java.util.Arrays;

public class Mass5 {
    public static void main(String[] args){
        int array1[][] = {{1,2,3},{4,5,6}};
        int array2[][] = {{1,2,3},{4,5,6}};
        System.out.println("Проверка на равенство двух двухмерных массивов :");
        if (Arrays.deepEquals(array1, array2)) {
            System.out.println("Массивы равны");
        } else {
            System.out.println("Массивы не равны");
        }
    }
}
