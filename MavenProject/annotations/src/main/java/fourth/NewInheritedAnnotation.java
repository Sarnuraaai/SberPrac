package fourth;

import java.lang.annotation.Inherited;

@Inherited
public @interface NewInheritedAnnotation {
    int day() default 7;
}
