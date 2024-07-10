package second;

import org.junit.Test;

public class RepeatableAnnotationTest {
    @Test
    public void RepeatedAnnotatedWorkTest() {
        RepeatableAnnotation[] repeatableAnnotations = RepeatedAnnotatedWork.class
                .getAnnotationsByType(RepeatableAnnotation.class);
        for (RepeatableAnnotation repeatableAnnotation : repeatableAnnotations) {
            System.out.println("hour: " + repeatableAnnotation.hours());
            System.out.println("prior: " + repeatableAnnotation.prior());
            System.out.println("details: " + repeatableAnnotation.details());
        }
    }
}
