package Lesson17DateTime;

import org.junit.Test;

import java.time.LocalDate;


public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        LocalDate localDate = LocalDate.now();
        System.out.println( " Дата : " + task2.plusMonths(localDate, 3));
    }
    @Test
    public LocalDate plusMonths(LocalDate localDate, int months) {
        return localDate.plusMonths(months);
    }
}
