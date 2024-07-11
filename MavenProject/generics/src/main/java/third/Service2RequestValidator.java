package third;

public class Service2RequestValidator implements RequestValidator<Integer> {

    @Override
    public boolean validateRequest(Integer request) {
        return request % 2 == 0;
    }
}
