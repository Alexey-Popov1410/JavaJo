package Lesson16New;

import Lesson16New.task1.TestFiles;
import Lesson16New.task1.TestStream;
import Lesson16New.task2.Computer;
import Lesson16New.task2.Keyboard;
import Lesson16New.task2.Monitor;
import Lesson16New.task2.Mouse;
import Lesson16New.task3.EthAdapter;
import Lesson16New.task3.Notebook;
import Lesson16New.task3.Touchpad;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Задание 1 ");
        TestStream testStream = new TestStream(new File("src/Lesson16New/task1/text"), new File("src/Lesson16New/task1/text(2)"));
        StringBuilder sb = testStream.testRead();
        testStream.testBuffRead();
        testStream.testWrite(sb.toString());
        testStream.testBuffWrite(sb.toString());

        TestFiles testFiles = new TestFiles("src/Lesson16New/task1/text", "src/Lesson16New/task1/text(2)");
        List<String> list = testFiles.testRead();
        testFiles.testWrite(list);



        System.out.println(" Задание 2 ");
        Computer computer = new Computer(new Keyboard("keyboard"), new Monitor("hp"), new Mouse("def11"));
        System.out.println(computer.toString());
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/Lesson16New/fileObj");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(computer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Computer readComputer = null;
        try (FileInputStream fileInputStream = new FileInputStream("src/Lesson16New/fileObj");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
            readComputer = (Computer) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (readComputer != null) {
            System.out.println(readComputer.toString());
        }


        System.out.println(" Задание 3 ");
        Notebook notebook = new Notebook(new Monitor("4monitor"), new Touchpad("4touch"), new EthAdapter("name"));
        System.out.println(notebook.toString());
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/Lesson16New/fileNotebook");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(notebook);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Notebook readNotebook = null;
        try (FileInputStream fileInputStream = new FileInputStream("src/Lesson16New/fileNotebook");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            readNotebook = (Notebook) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (readNotebook != null) {
            System.out.println(readNotebook.toString());
        }
    }
}
