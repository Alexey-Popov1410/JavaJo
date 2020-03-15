package Lesson13;

public class String1 {
    public static void main(String[] args) {
        String string = "";
        for (int i = 0; i <= 30; i++){
            string += 1;
            System.out.println(string);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 30 ; i++) {
            sb.append(1);
            System.out.println(sb);
        }
    }
}
