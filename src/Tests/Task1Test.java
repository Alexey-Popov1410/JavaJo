package Tests;

import Lesson17DateTime.Task1;
import org.junit.Assert;
import org.junit.Test;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Task1Test {
    @Test
    public void getTest(){
        Task1 task1 = new Task1();
        LocalDate localDate = LocalDate.of(2020, 8, 25);
        Assert.assertEquals("25.08.2020", task1.getDate(localDate));
        LocalDate localDate3 = LocalDate.of(2020, 1, 25);
        Assert.assertEquals("25.01.2020", task1.getDate(localDate3));
        LocalDate localDate4 = LocalDate.of(2020, 12, 25);
        Assert.assertEquals("25.12.2020", task1.getDate(localDate4));
    }
    @Test(expected = DateTimeException.class)
    public void dateExceptionTest(){
        Task1 exercise1 = new Task1();
        LocalDate localDate2 = LocalDate.of(2020, 1, 72);
        exercise1.getDate(localDate2);
    }
}
