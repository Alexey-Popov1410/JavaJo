package Lesson15;
import java.io.*;
import java.util.regex.*;

public class FileToConsole {
    File file;

    public FileToConsole(String fullPath) {
        this.file = new File(fullPath);
    }

    public void printAll() {
        if (file.exists() && file.isFile()) {
            try (BufferedReader bf = new BufferedReader(new FileReader(file));) {
                while (bf.ready()) {
                    System.out.println(bf.readLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void wordsVowelsFirst() {
        if (file.exists() && file.isFile()) {
            try (BufferedReader bf = new BufferedReader(new FileReader(file));) {
                while (bf.ready()) {
                    Pattern pattern = Pattern.compile("\\b[аеёиоуыэюяaoiuye][\\w\\dа-я]*", Pattern.CASE_INSENSITIVE);
                    Matcher matcher = pattern.matcher(bf.readLine());
                    while (matcher.find()) {
                        System.out.println(matcher.group());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void lastFirstLetter() {
        if (file.exists() && file.isFile()) {
            try (BufferedReader bf = new BufferedReader(new FileReader(file));) {
                while (bf.ready()) {
                    Pattern pattern = Pattern.compile("\\b[\\wa-я]+");
                    Matcher matcher = pattern.matcher(bf.readLine());
                    while (matcher.find()) {
                        if (matcher.group().charAt(0) == matcher.group().charAt(matcher.group().length() - 1)) {
                            System.out.println(matcher.group());
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void maxNumeralInLine() {
        if (file.exists() && file.isFile()) {
            try (BufferedReader bf = new BufferedReader(new FileReader(file));) {
                while (bf.ready()) {
                    int length = 0;
                    String number = null;
                    Pattern pattern = Pattern.compile("\\d+");
                    Matcher matcher = pattern.matcher(bf.readLine());
                    while (matcher.find()) {
                        if (matcher.group().length() > length) {
                            length = matcher.group().length();
                            number = matcher.group();
                        }
                    }
                    if(number != null) {
                        System.out.println(number);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
