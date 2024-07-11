package second;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;

public class RepeatableAnnotationTest {
    @Test
    public void RepeatedAnnotatedWorkTest() {
        int count = 0;
        ArrayList<Integer> hours = new ArrayList<>(4);
        hours.add(0);
        hours.add(1);
        hours.add(2);
        hours.add(3);
        ArrayList<Integer> priors = new ArrayList<>(4);
        priors.add(0);
        priors.add(2);
        priors.add(1);
        priors.add(3);
        ArrayList<String> details = new ArrayList<>(4);
        details.add("None");
        details.add("policeman");
        details.add("doctor");
        details.add("old man");
        RepeatableAnnotation[] repeatableAnnotations = RepeatedAnnotatedWork.class
                .getAnnotationsByType(RepeatableAnnotation.class);
        for (RepeatableAnnotation repeatableAnnotation : repeatableAnnotations) {
            Assertions.assertThat(repeatableAnnotation.hours()).isEqualTo(hours.get(count));
            Assertions.assertThat(repeatableAnnotation.prior()).isEqualTo(priors.get(count));
            Assertions.assertThat(repeatableAnnotation.details()).isEqualTo(details.get(count));
            count++;
        }
    }
}
