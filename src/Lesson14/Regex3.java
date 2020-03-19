package Lesson14;

public class Regex3 {
    private static String replace(String str){
        return str.replaceAll("<([a-z0-9]+) +[^>]+>", "<$1>");
    }

    public static void main(String[] args) {
        String s3 = " <pom class=\"header\"> \n" +
                " <plum class=\"subTitle\">\n" +
                " <triam class=\"packageLabelInType\">Package\n" +
                " <wow href=\"../../../org/jsoup/nodes/package-summary.html\">org.jsoup.nodes\n" +
                " <h2 title=\"Class Element\" class=\"title\">Class  \n";
        System.out.println(replace(s3));
    }
}
