package third;

public class ServiceUtil<Q, S> {
    private final RequestValidator<Q> requestValidator;
    private final ResponseValidator<S> responseValidator;

    public ServiceUtil(RequestValidator<Q> requestValidator, ResponseValidator<S> responseValidator) {
        this.requestValidator = requestValidator;
        this.responseValidator = responseValidator;
    }

    public void workWithService(Q request) {
        if (requestValidator.validateRequest(request)) {
            System.out.println("Сообщение отправлено");

            System.out.println("Работа с сервером");
            S response = null;

            if (responseValidator.validateResponse(response)) {
                System.out.println("Ответ получен");
            } else {
                System.out.println("Ответ не получен");
            }
        } else {
            System.out.println("Сообщение не отправлено");
        }
    }
}
