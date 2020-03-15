package Lesson12;

public class Exception3 extends Exception {
    public static void main(String args[]) {
        int i = 0;
        try {
            myException(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void myException(int i) throws Exception {
        if (i == 0)
            throw new Exception("Ошибка! Число = " +i);
        else
            System.out.println("Число = "+ i);
    }
}


