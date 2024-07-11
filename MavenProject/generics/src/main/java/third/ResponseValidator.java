package third;

public interface ResponseValidator<S> {
    boolean validateResponse(S response);
}
