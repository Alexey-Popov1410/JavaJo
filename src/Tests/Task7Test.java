package Tests;

import Lesson17DateTime.Task7;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Task7Test {
    @Test
    public void adjustInto(){
        Task7 task7 = new Task7();
        LocalDate localDate = LocalDate.of(2017, 7, 9);
        LocalDate localDate2 = LocalDate.of(2017, 8, 20);
        Assert.assertNotNull(localDate);
        Assert.assertNotNull(localDate2);
        Assert.assertEquals(localDate2, task7.adjustInto(localDate));
    }
}
