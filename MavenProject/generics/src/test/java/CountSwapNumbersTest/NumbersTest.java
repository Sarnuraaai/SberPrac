package CountSwapNumbersTest;

import first_second_tasks.CountSwapNumbers;
import org.junit.Test;
import org.assertj.core.api.Assertions;

import java.util.ArrayList;

public class NumbersTest {
    @Test
    public void countNumbersTest() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Assertions.assertThat(CountSwapNumbers.countNumbers(list)).isEqualTo(2);
    }

    @Test
    public void swapNumbersTest() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(5);
        list2.add(3);
        list2.add(4);
        list2.add(2);

        CountSwapNumbers.swapElements(list1, 1, 4);
        Assertions.assertThat(list1).isEqualTo(list2);
    }

    @Test
    public void swapNumbersOutTest() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Assertions.assertThatThrownBy(() -> CountSwapNumbers.swapElements(list, 1, 5)).isInstanceOf(IndexOutOfBoundsException.class);
    }
}
