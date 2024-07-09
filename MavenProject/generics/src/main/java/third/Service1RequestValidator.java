package third;

public class Service1RequestValidator implements RequestValidator<String> {

    @Override
    public boolean validateRequest(String request) {
        Service1 service1 = new Service1();
        service1.callService1();
        return request.length() > 5;
    }
}
