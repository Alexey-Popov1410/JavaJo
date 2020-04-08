package Lesson17DateTime;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Task6 {
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2020, 6, 25);
        LocalDateTime localDateTime1 = localDate.atTime(0, 0, 0);
        LocalDateTime localDateTime2 = localDate1.atTime(0, 0, 0);
        System.out.println( " Количество секунд : " + task6.getSeconds(localDateTime1, localDateTime2));
    }
    @Test
    public long getSeconds(LocalDateTime localDate1, LocalDateTime localDate2) {
        return Duration.between(localDate1, localDate2).get(ChronoUnit.SECONDS);
    }
}
