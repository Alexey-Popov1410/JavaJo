package Lesson13;

public class String3 {
    public static void main(String[] args) {
        String word = "Почему";
        String line = "Почему, Я, Такой, Почему";
        boolean start = line.startsWith(word);
        System.out.println("Строка начинается с Почему " + start);
        boolean end = line.endsWith(word);
        System.out.println("Строка заканчивается на Почему " + end);
    }
}
