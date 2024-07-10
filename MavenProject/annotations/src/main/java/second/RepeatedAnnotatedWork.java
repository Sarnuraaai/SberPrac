package second;

@RepeatableAnnotation
@RepeatableAnnotation(hours = 1, prior = 2, details = "policeman")
@RepeatableAnnotation(hours = 2, prior = 1, details = "doctor")
@RepeatableAnnotation(hours = 3, prior = 3, details = "old man")
public class RepeatedAnnotatedWork {
}
