package fourth;

import fifth.NewRepeatableAnnotation;
import third.DataContainer;

@NewInheritedAnnotation(day = 2)
public class InheritedClass3 extends InheritedAnnotatedClass{

    @NewRepeatableAnnotation(id = 1, name = "Igor", onDuty = false)
    public void method(DataContainer dataContainer) {

    }
}
