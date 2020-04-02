package Lesson15;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileToConsole toConsole = null;
//        System.out.println(" Введите полный путь к файлу : ");
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));) {
            toConsole = new FileToConsole("src" + File.separator + "Lesson15" + File.separator + "BinaryFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }


//        System.out.println(" Задача_1 ");
//        toConsole.printAll();


//        System.out.println(" Задача_2 ");
//        toConsole.wordsVowelsFirst();


//        System.out.println(" Задача_3 ");
//        toConsole.lastFirstLetter();


//        System.out.println(" Задача_4 ");
//        toConsole.maxNumeralInLine();


//        System.out.println(" Задача_5 ");
//        BinaryFile wf = new BinaryFile("src" + File.separator + "Lesson15" + File.separator + "BinaryFile");
//        wf.writeBinaryData();
//        wf.readBinaryData();


//        System.out.println(" Задача_6 ");
//        ListDirectory listDirectory = new ListDirectory();
//        listDirectory.listAll(new File("D:\\tests\\abc"));


//        System.out.println(" Задача_7 ");
//        ReverseJava reverseJava = new ReverseJava("src" + File.separator + "Lesson15" + File.separator + "Main.java", "src" + File.separator + "forLesson15" + File.separator + "ReversCod");
//        reverseJava.revers();
    }
}
