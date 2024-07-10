package fourth;

import fifth.NewRepeatableAnnotation;
import third.DataContainer;

public class InheritedClass2 extends InheritedAnnotatedClass {

    @NewRepeatableAnnotation(id = 2, name = "Mathew", onDuty = true)
    public void method(DataContainer dataContainer) {

    }
}
