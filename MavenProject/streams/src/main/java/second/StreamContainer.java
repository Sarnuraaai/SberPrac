package second;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StreamContainer {
    private String name;
    private long count;

    @Override
    public String toString() {
        return "name: " + getName() + ", count: " + getCount();
    }
}
