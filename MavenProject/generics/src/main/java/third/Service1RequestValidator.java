package third;

public class Service1RequestValidator implements RequestValidator<String> {

    @Override
    public boolean validateRequest(String request) {
        return request.length() > 5;
    }
}
