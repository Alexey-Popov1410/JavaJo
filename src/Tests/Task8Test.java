package Tests;

import Lesson17DateTime.Task8;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Task8Test {
    @Test
    public void adjustIntoTest() {
        LocalDate localDate = LocalDate.of(2020, 12, 2);
        Task8 task8 = new Task8(localDate);
        LocalDate localDate2 = LocalDate.of(2021, 1, 1);
        Assert.assertNotNull(localDate);
        Assert.assertNotNull(localDate2);
        Assert.assertEquals(localDate2, task8.adjustInto(localDate));
    }
}
