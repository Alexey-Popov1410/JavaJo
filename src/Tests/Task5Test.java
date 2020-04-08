package Tests;

import Lesson17DateTime.Task5;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Task5Test {
    @Test
    public void getBetweenDaysTest(){
        Task5 task5 = new Task5();
        LocalDate localDate = LocalDate.of(2017, 4, 4);
        LocalDate localDate1 = LocalDate.of(2020, 6, 25);
        Assert.assertNotNull(localDate);
        Assert.assertNotNull(localDate1);
        Assert.assertEquals(1178, task5.betweenDays(localDate, localDate1));
    }
}
