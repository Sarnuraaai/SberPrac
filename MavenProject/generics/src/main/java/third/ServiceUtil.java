package third;

public class ServiceUtil<Q, S> {
    private final RequestValidator<Q> requestValidator;
    private final ResponseValidator<S> responseValidator;

    public ServiceUtil(RequestValidator<Q> requestValidator, ResponseValidator<S> responseValidator) {
        this.requestValidator = requestValidator;
        this.responseValidator = responseValidator;
    }

    public boolean workWithService(Q request) {
        if (requestValidator.validateRequest(request)) {

            S response = null;

            return responseValidator.validateResponse(response);
        } else {
            return false;
        }
    }
}
