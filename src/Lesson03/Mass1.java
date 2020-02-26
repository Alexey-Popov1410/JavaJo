package Lesson03;

public class Mass1 {
    public static void main(String[] args){
        int array[] = new int[]{1,2,3,4,5};
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
        for (int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
}
