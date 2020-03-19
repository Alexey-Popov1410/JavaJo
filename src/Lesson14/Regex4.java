package Lesson14;

public class Regex4 {
    private static void phoneNumbers(String str){
        System.out.println(str.replaceAll("(\\+375)(\\d{2})(\\d{3})(\\d{2})(\\d{2})", "$1 ($2) $3-$4-$5"));
    }

    public static void main(String[] args) {
        phoneNumbers(" +375173051842\n +375258372013\n +375299640174");
    }
}
