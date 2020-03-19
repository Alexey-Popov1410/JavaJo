package Lesson14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {
    private static String ip(String str) {
        Pattern ipAddress = Pattern.compile("^(?!0)(?!.*\\.$)((1?\\d?\\d|25[0-5]|2[0-4]\\d)(\\.|$)){4}$");
        Matcher mat = ipAddress.matcher(str);
        if (mat.find()) {
            System.out.println("IP correct");
        }
        else System.out.println("IP incorrect");
        return str;
    }

    public static void main(String[] args) {
        String ipAdd = "46.216.6.239";
        System.out.println(ipAdd);
        ip(ipAdd);
    }
}
