package Lesson17DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class Task7 implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return (temporal.plus(Period.ofDays(42)));
    }

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        Task7 adjuster = new Task7();
        System.out.println( " Дата : " + adjuster.adjustInto(localDate));
    }
}