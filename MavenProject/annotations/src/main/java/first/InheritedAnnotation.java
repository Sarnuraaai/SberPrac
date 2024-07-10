package first;

import java.lang.annotation.Inherited;

@Inherited
public @interface InheritedAnnotation {
    int day() default 7;
}
