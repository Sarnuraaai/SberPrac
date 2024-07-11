package resourceProcessor;

import lombok.AllArgsConstructor;
import resource.Resource;

@AllArgsConstructor
public class ResourceProcessor {
    private final Resource resource;

    public synchronized void increase() {
//        final int res = resource.getRes() + 1;
//        resource.setRes(res);
//        System.out.println("Новое значение: " + res);

        if (resource.getRes() >= 5) {
            try {
                wait();
            } catch (Exception ignored) {
            }
        }

        final int res = resource.getRes() + 1;
        resource.setRes(res);
        System.out.println("Новое значение: " + res);

        notify();
    }

    public synchronized void decrease() {
//        final int res = resource.getRes() - 1;
//        resource.setRes(res);
//        System.out.println("Новое значение: " + res);

        if (resource.getRes() < 1) {
            try {
                wait();
            } catch (Exception ignored) {
            }
        }

        final int res = resource.getRes() - 1;
        resource.setRes(res);
        System.out.println("Новое значение: " + res);

        notify();
    }
}
