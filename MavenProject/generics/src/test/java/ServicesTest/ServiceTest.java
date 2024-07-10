package ServicesTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.assertj.core.api.Assertions;
import third.*;

public class ServiceTest {
    @ParameterizedTest
    @CsvSource({
            "message, true",
            "call, false"
    })
    public void Service1Test(String arg, boolean result) {
        ServiceUtil<String, String> service1 = new ServiceUtil<>(new Service1RequestValidator(), new Service1ResponseValidator());
        Assertions.assertThat(service1.workWithService(arg)).isEqualTo(result);
    }

    @ParameterizedTest
    @CsvSource({
            "124, true",
            "71, false"
    })
    public void Service2Test(Integer arg, boolean result) {
        ServiceUtil<Integer, Integer> service2 = new ServiceUtil<>(new Service2RequestValidator(), new Service2ResponseValidator());
        Assertions.assertThat(service2.workWithService(arg)).isEqualTo(result);
    }
}
