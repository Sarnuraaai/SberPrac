package TaskTests;

import dataContainer.Task;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TaskTest {
    @Test
    public void taskTest() throws NoSuchFieldException, InvocationTargetException, IllegalAccessException {
        Calendar calendar = new GregorianCalendar();
        calendar.set(1922, 12, 30, 12, 12);

        Task task = Mockito.mock(Task.class, Mockito.CALLS_REAL_METHODS);

        task.task(calendar,1,"Vladimir", true);

        Mockito.verify(task,Mockito.times(1)).task(Mockito.any(),Mockito.anyInt(),Mockito.anyString(), Mockito.anyBoolean());
    }
}
