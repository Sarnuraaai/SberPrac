package fifth;

import java.util.stream.Stream;

public class StringToBoolean {
    public static void main(String[] args) {
        String string = "1010010111";
        Stream<Boolean> stream = string.codePoints()
                .mapToObj(ch -> String.valueOf((char) ch).equals("1"));

        boolean result = stream.reduce(true, (ch1, ch2) -> ch1 && ch2);

        System.out.println(result);
    }


}
