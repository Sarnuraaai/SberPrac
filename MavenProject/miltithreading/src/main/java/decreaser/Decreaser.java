package decreaser;

import lombok.AllArgsConstructor;
import resourceProcessor.ResourceProcessor;

@AllArgsConstructor
public class Decreaser implements Runnable {
    private ResourceProcessor resourceProcessor;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resourceProcessor.decrease();
        }
    }
}
