package dataContainer;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, InvocationTargetException, IllegalAccessException {
        Calendar calendar = new GregorianCalendar();
        calendar.set(1922, 12, 30, 12, 12);
        new Task().task(calendar, 1, "Vladimir", true);
    }

}
