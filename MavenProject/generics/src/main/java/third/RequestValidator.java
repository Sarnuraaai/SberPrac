package third;

public interface RequestValidator<Q> {
    boolean validateRequest(Q request);
}
