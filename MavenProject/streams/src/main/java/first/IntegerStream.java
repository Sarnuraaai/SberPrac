package first;

import java.util.stream.*;

public class IntegerStream {
    public static void main(String[] args) {
        IntStream stream = IntStream.generate(() -> (int) (Math.random() * 25)).limit(10);
        double avg = stream.filter(I -> I > 9 && I < 100).sorted().average().orElse(0);
        System.out.println(avg);
    }
}
