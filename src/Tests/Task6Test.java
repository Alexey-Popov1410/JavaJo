package Tests;

import Lesson17DateTime.Task6;
import org.junit.Assert;
import org.junit.Test;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task6Test {
    @Test
    public void getSecondsTest(){
        Task6 task6 = new Task6();
        LocalDate localDate = LocalDate.of(2020, 5, 25);
        LocalDate localDate1 = LocalDate.of(2020, 6, 25);
        LocalDateTime localDateTime1 = localDate.atTime(4, 0, 0);
        LocalDateTime localDateTime2 = localDate1.atTime(0, 9, 0);
        Assert.assertNotNull(localDate);
        Assert.assertNotNull(localDate1);
        Assert.assertEquals(2664540, task6.getSeconds(localDateTime1, localDateTime2));
    }
    @Test(expected = DateTimeException.class)
    public void dateExceptionTest(){
        Task6 task6 = new Task6();
        LocalDate localDate = LocalDate.of(2020, -5, 25);
        LocalDate localDate1 = LocalDate.of(2020, 6, 25);
        LocalDateTime localDateTime1 = localDate.atTime(4, 0, 0);
        LocalDateTime localDateTime2 = localDate1.atTime(0, 9, 0);
        Assert.assertNotNull(localDate);
        Assert.assertNotNull(localDate1);
        task6.getSeconds(localDateTime1, localDateTime2);
    }
}
