package fifth;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface NewRepeatableAnnotations {
    NewRepeatableAnnotation[] value() default {};
}
