package Tests;

import Lesson17DateTime.Task3;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Task3Test {
    @Test
    public void getTest(){
        Task3 task3 = new Task3();
        LocalDate localDate = LocalDate.of(2017, 5, 5);
        Assert.assertNotNull(localDate);
        Assert.assertEquals("05.05.2017", task3.getDate(localDate));
    }
}
