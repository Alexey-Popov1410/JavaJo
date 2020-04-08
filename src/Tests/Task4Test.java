package Tests;

import Lesson17DateTime.Task4;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Task4Test {
    @Test
    public void getTest(){
        Task4 task4 = new Task4();
        LocalDate localDate = LocalDate.of(2019, 4,23);
        Assert.assertNotNull(localDate);
        Assert.assertEquals(localDate, task4.getDate("23-04-2019"));
    }
    @Test(expected = DateTimeParseException.class)
    public void dateExceptionTest(){
        Task4 task4 = new Task4();
        task4.getDate("23-04/2019");
    }
}
