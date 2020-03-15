package Lesson12;

public class Exception1 {


    public int divisionByZero(){
        int b = 0;
        int a = 10;
        return a /= b;
    }

    public static void main(String[] args) {
        Exception1 ex = new Exception1();
        try {
            ex.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль !");
        }
    }
}
