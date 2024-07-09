package first_second_tasks;

import java.util.ArrayList;
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
        if (0 <= ind1 && ind1 < collection.size() && 0 <= ind2 && ind2 < collection.size()) {
            Collections.swap((List<?>) collection,ind1,ind2);
        }
        else {
            System.out.println("Выход за пределы коллекции!");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Количество чётных чисел: " + countNumbers(list));

        System.out.println("До смены местами: " + list);
        swapElements(list, 1, 4);
        System.out.println("После смены местами: " + list);
        swapElements(list, 1, 5);
    }
}
