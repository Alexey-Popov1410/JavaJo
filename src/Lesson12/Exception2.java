package Lesson12;

public class Exception2 {
    public static void main(String[] args) {
        try {
            int array[] = new int[]{1, 2, 3, 4, 5};
            for (int i = array.length; i >= 0; i--) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Индекс за пределами массива !");
        }
    }
}
