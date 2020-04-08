package Lesson17DateTime;

import org.junit.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Task5 {
    public static void main(String[] args) {
        Task5 task5 = new Task5();
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2020, 6, 25);
        System.out.println( " Количество дней : " + task5.betweenDays(localDate, localDate1));
    }
    @Test
    public long betweenDays(LocalDate localDate1, LocalDate localDate2) {
        return ChronoUnit.DAYS.between(localDate1, localDate2);
    }
}
