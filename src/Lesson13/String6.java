package Lesson13;

public class String6 {
    public static void main(String[] args) {
        String str = "aaabbcdeef";
        System.out.println(str.replaceAll("([a-zA-Z])\\1{1,}", "$1"));
    }
}
