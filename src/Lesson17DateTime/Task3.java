package Lesson17DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        LocalDate localDate = LocalDate.now();
        System.out.println( " Дата : " + task3.getDate(localDate));
    }

    public String getDate(LocalDate localDate) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return localDate.format(dateTimeFormatter);
    }
}
