package Lesson12;

public class Exception7 {
    public static void main(String[] args) throws Exception {
        try{
            FiftyPercentException();
        }
        catch (Exception e) {
            System.out.println("Ошибка ! i = 0 : " + e);
        }
        finally {
            System.out.println("i не может быть = 0");
        }
    }
    public static void FiftyPercentException() throws Exception{
        int i = (int) (Math.random() * 2);
        if (i == 0){throw new NullPointerException();}
    }
}
