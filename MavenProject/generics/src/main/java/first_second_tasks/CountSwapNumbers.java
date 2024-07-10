package first_second_tasks;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CountSwapNumbers {
    public static <T extends Number> int countNumbers(Collection<T> collection) {
        int count = 0;
        for (T number : collection) {
            if (number.intValue() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void swapElements(Collection<?> collection, int ind1, int ind2) {
        Collections.swap((List<?>) collection, ind1, ind2);
    }
}
