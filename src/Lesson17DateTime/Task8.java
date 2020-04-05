package Lesson17DateTime;

import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Task8 implements TemporalAdjuster {

    LocalDate localDate;

    public Task8(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public Temporal adjustInto(Temporal temporal) {
        if (localDate.getMonthValue() <= 6) {
            return temporal.with(TemporalAdjusters.firstDayOfYear());
        }
        return temporal.with(TemporalAdjusters.firstDayOfNextYear());
    }

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        Task8 task8 = new Task8(localDate);
        System.out.println( " Дата : " + task8.adjustInto(localDate));
    }
}
