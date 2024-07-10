package fifth;

import java.util.stream.Stream;

public class StringToBoolean {
    public boolean stringToBoolean(String string) {
        Stream<Boolean> stream = string.codePoints()
                .mapToObj(ch -> String.valueOf((char) ch).equals("1"));

        return stream.reduce(true, (ch1, ch2) -> ch1 && ch2);
    }


}
