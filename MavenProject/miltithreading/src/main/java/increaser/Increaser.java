package increaser;

import lombok.AllArgsConstructor;
import resourceProcessor.ResourceProcessor;

@AllArgsConstructor
public class Increaser extends Thread {
    private ResourceProcessor resourceProcessor;

    @Override
    public void run() {
//        resourceProcessor.increase();
//        resourceProcessor.increase();
//        resourceProcessor.increase();
//        resourceProcessor.increase();
//        resourceProcessor.increase();
//        resourceProcessor.increase();

        for (int i=0; i < 10; i++) {
            resourceProcessor.increase();
        }
    }

}
