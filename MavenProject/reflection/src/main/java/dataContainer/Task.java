package dataContainer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.lang.reflect.Field;

public class Task {
    public void task(Calendar date, int id, String name, boolean onDuty) throws InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        DataContainer dataContainer = new DataContainer(id, name, onDuty);
        InheritedClass2 inheritedClass2 = new InheritedClass2();

        Map<Integer, ArrayList<Method>> listMap = new HashMap<>();
        for (Method method : inheritedClass2.getClass().getDeclaredMethods()) {
            RepeatableAnnotation[] annotations = method.getAnnotationsByType(RepeatableAnnotation.class);
            for (RepeatableAnnotation repeatableAnnotation : annotations) {
                if (repeatableAnnotation.hours() == date.get(Calendar.HOUR_OF_DAY)) {
                    if (!listMap.containsKey(repeatableAnnotation.prior())) {
                        listMap.put(repeatableAnnotation.prior(), new ArrayList<>() {{
                            add(method);
                        }});
                        continue;
                    }

                    listMap.get(repeatableAnnotation.prior()).add(method);
                }
            }
        }

        for (Integer key : listMap.keySet().stream().sorted().toList()) {
            for (Method method : listMap.get(key)) {
                method.invoke(inheritedClass2, dataContainer);

                Field new_id = dataContainer.getClass().getDeclaredField("id");
                Field new_name = dataContainer.getClass().getDeclaredField("name");
                Field new_onDuty = dataContainer.getClass().getDeclaredField("onDuty");

                new_id.setAccessible(true);
                new_name.setAccessible(true);
                new_onDuty.setAccessible(true);

                System.out.println("id: " + new_id.get(dataContainer) +
                        ", name: " + new_name.get(dataContainer) +
                        ", onDuty: " + new_onDuty.get(dataContainer));

                new_id.setAccessible(false);
                new_name.setAccessible(false);
                new_onDuty.setAccessible(false);
            }
        }
    }
}
