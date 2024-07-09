package third;

public class Service2ResponseValidator implements ResponseValidator<Integer> {
    @Override
    public boolean validateResponse(Integer response) {
        return true;
    }
}
