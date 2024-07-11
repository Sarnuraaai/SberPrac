import org.junit.Test;
import org.mockito.Mockito;
import third_fourth.Streams;

public class StreamsTest {
    @Test
    public void stringStreamTest() {
        Streams streams = Mockito.mock(Streams.class, Mockito.CALLS_REAL_METHODS);

        streams.stringStream();
        Mockito.verify(streams, Mockito.times(1)).stringStream();
    }

    @Test
    public void mapStreamTest() {
        Streams streams = Mockito.mock(Streams.class, Mockito.CALLS_REAL_METHODS);

        streams.mapStream();
        Mockito.verify(streams, Mockito.times(1)).mapStream();
    }
}
