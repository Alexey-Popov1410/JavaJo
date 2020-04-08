package Lesson17DateTime;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task4 {
    public static void main(String[] args) {
        Task4 task4 = new Task4();
        System.out.println(task4.getDate("26-03-2014"));
    }
    @Test
    public LocalDate getDate(String text){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(text, formatter);
    }
}
