package Lesson13;

public class String4 {
    public static void main(String[] args) {
        String sname = "Степаненко";
        String name = "Никита";
        String midName = "Андреевич";
        String snamenamemidName = (String) sname.trim().subSequence(0,1);
        String snamenamemidName1 = (String) name.trim().subSequence(0,1);
        String snamenamemidName2 = (String) midName.trim().subSequence(0,1);
        System.out.println("Ф.И.О - "+ snamenamemidName.toUpperCase()+"."+ snamenamemidName1.toUpperCase()+"."+ snamenamemidName2.toUpperCase());
    }
}
