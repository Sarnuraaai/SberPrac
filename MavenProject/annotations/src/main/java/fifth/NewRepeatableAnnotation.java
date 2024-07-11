package fifth;

import java.lang.annotation.Repeatable;

@Repeatable(NewRepeatableAnnotations.class)
public @interface NewRepeatableAnnotation {
    int id() default 0;
    String name() default "None";
    boolean onDuty() default false;
}
