package Lesson12;


public class Exception4 extends RuntimeException {
    public static void main(String[] args) {
        System.out.println("Отлов деления на ноль :");
        myException();
    }
    static void myException() throws RuntimeException{
        try {
            int a = 0;
            int b = 10 / a;
        } catch (RuntimeException e){
            System.out.println("Перехвачено деление на ноль : " + e);
        }
    }
}
