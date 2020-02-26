package Lesson03;

public class Mass2 {
    public static void main(String[] args){
        int array[] = new int[100];
        int number = 0;
        int position = 0;
        for (int i = 0; i <array.length ; i++) {
            number++;
            do {
                if (number % 13 == 0 || number % 17 == 0) {
                    array[i] = number;
                    System.out.println(array[i]);
                    number++;
                    position++;
                    i++;
                }
                number++;
            } while (position != 100);
        }
    }
}

