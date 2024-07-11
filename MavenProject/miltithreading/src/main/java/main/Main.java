package main;

import decreaser.Decreaser;
import increaser.Increaser;
import resource.Resource;
import resourceProcessor.ResourceProcessor;

public class Main {
    public static void main(String[] args) {
        Resource resource = new Resource(1);
        ResourceProcessor resourceProcessor = new ResourceProcessor(resource);

//        for (int i = 0; i < 5; i++) {
//            new Increaser(resourceProcessor).start();
//        }

        Increaser increaser = new Increaser(resourceProcessor);
        Decreaser decreaser = new Decreaser(resourceProcessor);

        increaser.start();
        new Thread(decreaser).start();
    }
}
