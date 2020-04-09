package Lesson15.task6;

import java.io.File;
import java.util.Objects;

public class Recursion {

        public void listAll(File file) {
            String t = " ";
            File[] files = file.listFiles();
            for (File f : Objects.requireNonNull(files)) {
                if (!f.isFile()) {
                    System.out.println(t + f.getName());
                    listAll(f);
                } else {
                    System.out.println("  " + f.getName());
                    t += t;
                }
            }
        }

    public static void main(String[] args) {
        System.out.println(" Задание 6 ");
        Recursion recursion = new Recursion();
        recursion.listAll(new File("D:" + File.separator + "test"));
    }
}
