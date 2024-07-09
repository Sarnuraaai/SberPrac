package third;

public class Service2RequestValidator implements RequestValidator<Integer> {

    @Override
    public boolean validateRequest(Integer request) {
        Service2 service2 = new Service2();
        service2.callService2();
        return request % 2 == 0;
    }
}
