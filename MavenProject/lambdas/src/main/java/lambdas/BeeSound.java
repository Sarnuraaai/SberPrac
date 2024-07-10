package lambdas;

public class BeeSound implements Sounding {

    @Override
    public void sound() {
        System.out.println("buzz");
    }
}
