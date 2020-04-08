package Lesson17DateTime;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task1 {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
            LocalDate localDate = LocalDate.of(2020, 6, 25);
            task1.getDate(localDate);
            System.out.println( " Дата : " + task1.getDate(localDate));
        }
    @Test
    public String getDate(LocalDate localDate){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return localDate.format(dateTimeFormatter);
    }
}
