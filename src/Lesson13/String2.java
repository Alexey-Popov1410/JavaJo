package Lesson13;

public class String2 {
    public static void main(String[] args) {
        String unsmile = ":(((((((";
        String smile = unsmile.replace('(', ')');
        System.out.println(unsmile);
        System.out.println(smile);
    }
}
