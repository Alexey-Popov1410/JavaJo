package Lesson12;

public class RandomException6 {
    public static void main(String[] args) throws Exception {
        try{
            Random();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void Random() throws Exception{
        int i = (int) (Math.random() * 3);
        if (i == 0){throw new NullPointerException();}
        if (i == 1){throw new ArithmeticException();}
        if (i == 2){throw new ArrayIndexOutOfBoundsException();}
    }
}
