package Lesson16New.task1;

import java.io.*;

public class TestStream {
    private final File fileRead;
    private final File fileWrite;
    private StringBuilder stringBuilder;

    public TestStream(File fileRead, File fileWrite) {
        this.fileRead = fileRead;
        this.fileWrite = fileWrite;
    }

    public StringBuilder testRead() {
        System.out.println("Небуфиризированное чтение");
        stringBuilder = new StringBuilder();
        if (fileRead.exists() && fileRead.isFile()) {
            try (FileReader fileReader = new FileReader(fileRead);) {
                long t1 = System.nanoTime();
                int i = -1;
                while ((i=fileReader.read()) > -1) {
                    stringBuilder.append((char)i);
                }
                long t2 = System.nanoTime();
                System.out.println("Лучшее время " + (t2 - t1));
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Такого файла не существует");
        }
        return stringBuilder;
    }

    public StringBuilder testBuffRead() {
        System.out.println("Буфиризированное чтение");
        stringBuilder = new StringBuilder();
        if (fileRead.exists() && fileRead.isFile()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileRead));) {
                long t1 = System.nanoTime();
                while (bufferedReader.ready()) {
                    stringBuilder.append(bufferedReader.read());
                }
                long t2 = System.nanoTime();
                System.out.println("Лучшее время " + (t2 - t1));
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Такого файла не существует");
        }
        return stringBuilder;
    }

    public void testWrite(String s) {
        System.out.println("Небуфиризированная запись");
        if (fileRead.exists() && fileRead.isFile()) {
            try (FileWriter fileWriter = new FileWriter(fileWrite)) {
                long t1 = System.nanoTime();
                fileWriter.write(s);
                fileWriter.flush();
                long t2 = System.nanoTime();
                System.out.println("Лучшее время " + (t2 - t1));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Такого файла не существует");
        }
    }

    public void testBuffWrite(String s) {
        System.out.println("Буфиризированная запись");
        if (fileRead.exists() && fileRead.isFile()) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileWrite))) {
                long t1 = System.nanoTime();
                bufferedWriter.write(s);
                bufferedWriter.flush();
                long t2 = System.nanoTime();
                System.out.println("Лучшее время " + (t2 - t1));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Такого файла не существует");
        }
    }
}
