package Tests;

import Lesson17DateTime.Task2;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Task2Test {
    @Test
    public void plusMonthsTest(){
        LocalDate localDate = LocalDate.of(2020, 12, 31);
        Task2 task2 = new Task2();
        LocalDate localDate2 = LocalDate.of(2021, 1, 31);
        Assert.assertNotNull(localDate);
        Assert.assertNotNull(localDate2);
        Assert.assertEquals(localDate2, task2.plusMonths(localDate, 1));
        Task2 task3 = new Task2();
        LocalDate localDate3 = LocalDate.of(2021, 2, 28);
        Assert.assertNotNull(localDate3);
        Assert.assertEquals(localDate3, task3.plusMonths(localDate2, 1));
    }
}
