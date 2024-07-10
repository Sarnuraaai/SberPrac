package second;

import java.lang.annotation.Repeatable;

@Repeatable(RepeatableAnnotations.class)
public @interface RepeatableAnnotation {
    int hours() default 0;
    int prior() default 0;
    String details() default "None";
}
