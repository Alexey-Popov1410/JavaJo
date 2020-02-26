package Lesson03;

public class Mass6 {
    public static void main(String[] args){
        int num = 17;
        int a;
        boolean b = false;
        for (a = 2; a < num; a++) {
            if (num % a == 0) {
                b = true;
                break;
            }
        }
        if (b) {
            System.out.println(num + " - Составное число");
        } else {
            System.out.println(num + " - Простое число");
        }
    }
}
