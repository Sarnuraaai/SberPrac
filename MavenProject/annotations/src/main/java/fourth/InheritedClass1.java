package fourth;

import fifth.NewRepeatableAnnotation;
import third.DataContainer;

public class InheritedClass1 extends InheritedAnnotatedClass {

    @NewRepeatableAnnotation(id = 1, name = "Igor", onDuty = true)
    public void method(DataContainer dataContainer) {

    }
}
