package Lesson14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    private static boolean email(String str){
        Pattern pat = Pattern.compile("^[a-zA-Z]+\\w*@[a-zA-Z]*\\.(org|com)$");
        Matcher mat = pat.matcher(str);
        return mat.matches();
    }

    public static void main(String[] args) {
        String str1 = "pvnbra_73291@man.org";
        System.out.printf("Строка %s - email: %s\n", str1, email(str1));
    }
}
