package Lesson14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    private static void numbers(String s) {
        Pattern pat = Pattern.compile("0[xX][0-9a-fA-F]+");
        Matcher mat = pat.matcher(s);

        while (mat.find()) {
            System.out.println(mat.group());
        }
    }

    public static void main(String[] args) {
        String str = "это random иргнпршг 0x51b 203edis1921 54 23 98989  989vd8989\n" +
                "dfrewjd  dfd 0 0x00bb9";
        numbers(str);
    }
}
