package Lesson15;
import java.io.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1 ");
        System.out.println(" Все слова построчно : ");
        String a = "";
        try (BufferedReader line = new BufferedReader(new FileReader("D://test//text.txt"))) {
            while (true) {
                try {
                    if ((a = line.readLine()) == null) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(" Задание 2 ");
        System.out.println(" Все слова начинающиеся с гласных : ");
        try (BufferedReader line = new BufferedReader(new FileReader("D://test//text.txt"))) {
            while ((a = line.readLine()) != null) {
                String[] words = a.split("[\\s,.:!?]+");
                Pattern pattern = Pattern.compile("^[aeyi]");
                for (String word : words) {
                    Matcher matcher = pattern.matcher(word.toLowerCase());
                    if (matcher.find()) {
                        System.out.println(word);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(" Задание 3 ");
        System.out.println(" Последняя буква одного слова совпадает с первой буквой\n" +
                "следующего слова : ");
        try (BufferedReader line = new BufferedReader(new FileReader("D://test//text.txt"))) {
            while ((a = line.readLine()) != null) {
                String[] words = a.split("[\\s,.:!?]+");
                for (int i = 0; i < words.length - 1; i++) {
                    if (!words[i].isEmpty() && !words[i + 1].isEmpty()) {
                        if (words[i].charAt(words[i].length() - 1) == words[i + 1].charAt(0)) {
                            System.out.println(words[i] + " " + words[i + 1]);
                        }
                    }
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println(" Задание 4 ");
        System.out.println(" Наибольшее число цифр в стороке, идущих подряд : ");
        try (BufferedReader line = new BufferedReader(new FileReader("D://test//text.txt"))) {
            while (line.ready()) {
                int length = 0;
                Pattern pattern = Pattern.compile("\\d+");
                Matcher matcher = pattern.matcher(line.readLine());
                while (matcher.find()) {
                    if (matcher.group().length() > length) {
                        length = matcher.group().length();
                        a = matcher.group();
                    }
                }
                if(a != null) {System.out.println(a);}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(" Задание 5 ");
        System.out.println("  Распечатка\n" +
                "чисел и их среднее арифметическое : ");
        try (DataOutputStream line = new DataOutputStream(new FileOutputStream("D://test//text.txt"))) {
            for (int i = 0; i < 20; i++) {
                int d = (int) (256 + (Math.random() *100));
                line.write(d);
            }
            line.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (DataInputStream line = new DataInputStream(new FileInputStream("D://test//text.txt"))) {
            int sum = 0, i = 0;
            System.out.println(" Прочитали числа: ");
            while (line.available() > 0) {
                int text = line.read();
                System.out.print(text + " ");
                sum += text;
                i++;
            }
            System.out.println(" Cреднее значение : " + sum / i);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(" Задание 6 ");
        System.out.println(" Список файлов и каталогов : ");
        File file = new File("D:" + File.separator + "test");
        listCatalog(file);

        System.out.println(" Задание 7 ");
        try (BufferedReader line = new BufferedReader(new FileReader("D:" + File.separator
                + "test" + File.separator + "text.java"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("D:" + File.separator
                     + "test" + File.separator +  "text1.java"))) {
            while ((a = line.readLine()) != null) {
                StringBuilder b = new StringBuilder(a);
                writer.write(String.valueOf(b.reverse()) + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void listCatalog(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            assert files != null;
            for (File s : files) {
                System.out.println(s);
            }
        }
    }
}
