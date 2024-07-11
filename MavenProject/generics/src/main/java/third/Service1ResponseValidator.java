package third;

public class Service1ResponseValidator implements ResponseValidator<String> {
    @Override
    public boolean validateResponse(String response) {
        return true;
    }
}
