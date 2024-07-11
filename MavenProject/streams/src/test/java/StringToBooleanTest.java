import fifth.StringToBoolean;
import org.junit.Test;
import org.assertj.core.api.Assertions;

public class StringToBooleanTest {
    @Test
    public void stringToBooleanTest() {
        String string = "1010010111";
        StringToBoolean stringToBoolean = new StringToBoolean();
        boolean result = stringToBoolean.stringToBoolean(string);
        Assertions.assertThat(result).isEqualTo(false);

        String string1 = "1111111111";
        result = stringToBoolean.stringToBoolean(string1);
        Assertions.assertThat(result).isEqualTo(true);
    }
}
