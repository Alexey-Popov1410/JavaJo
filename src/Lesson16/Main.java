package Lesson16;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1 ");
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader("D:\\test\\text.txt"));
            Reader reader2 = new FileReader("D:\\test\\text.txt");
            BufferedWriter writer1 = new BufferedWriter(new FileWriter("D:\\test\\text1.txt"));
            Writer writer2 = new FileWriter("D:\\test\\text1.txt");

            int noBuffer;
            StringBuilder noBuf = new StringBuilder();
            long timeStartReading = System.currentTimeMillis();
            while ((noBuffer = reader2.read()) >= 0) {
                noBuf.append(noBuffer);
            }
            long timeStopReading = System.currentTimeMillis();
            long timeReading = timeStopReading - timeStartReading;
            System.out.println(" Время чтения без буффера : " + timeReading);

            String yesBuffer;
            StringBuilder yesBuf = new StringBuilder();
            long timeStartReadingBuff = System.currentTimeMillis();
            while ((yesBuffer = reader1.readLine()) != null) {
                yesBuf.append(yesBuffer);
            }
            long timeStopReadingBuff = System.currentTimeMillis();
            long timeReadingBuff = timeStopReadingBuff - timeStartReadingBuff;
            System.out.println(" Время чтения с буффером : " + timeReadingBuff);

            long timeStartWriting = System.currentTimeMillis();
            writer2.write(noBuf.toString());

            long timeStopWriting = System.currentTimeMillis();
            long timeWriting = timeStopWriting - timeStartWriting;
            System.out.println(" Время записи без буффера : " + timeWriting);

            long timeStartWritingBuff = System.currentTimeMillis();
            writer1.write(yesBuf.toString());

            long timeStopWritingBuff = System.currentTimeMillis();
            long timeWritingBuff = timeStopWritingBuff - timeStartWritingBuff;
            System.out.println(" Время записи с буффера : " + timeWritingBuff);

            reader1.close();
            reader2.close();
            writer1.close();
            writer2.close();

        } catch (IOException e) {
            System.out.println(" Такого файла не существует ");
        }

        System.out.println(" Задание 2 ");
        Computer comp = new Computer("LenovoLegion", "i7",  1024);
        try (ObjectOutputStream list1 = new ObjectOutputStream(new FileOutputStream("D:\\test\\text.txt"));
             ObjectInputStream list2 = new ObjectInputStream(new FileInputStream("D:\\test\\text.txt"));
        ) {
            list1.writeObject(comp);
            Computer computer = (Computer) list2.readObject();
            System.out.println("Компьютер : " + computer.name + "\nПроцессор : " + computer.cpu);
        } catch (Exception e) {
            System.out.println(" Такого файла не существует ");
        }

        System.out.println(" Задание 3 ");
        Notebook book = new Notebook("Asus", "i5", 1024, 500, 7);
        try (ObjectOutputStream list1 = new ObjectOutputStream(new FileOutputStream("D:\\test\\text.txt"));
             ObjectInputStream list2 = new ObjectInputStream(new FileInputStream("D:\\test\\text.txt"));
        ) {
            list1.writeObject(book);
            Notebook notebook = (Notebook) list2.readObject();
            System.out.println(book.name + " "
                    + book.weight + " "
                    + book.buttons+ " "
                    + book.touchPad.buttons);
            System.out.println(notebook.name + " "
                    + notebook.weight + " "
                    + notebook.buttons+ " "
                    + notebook.touchPad.buttons);
        } catch (Exception e) {
            System.out.println(" Такого файла не существует ");
        }
    }
}
