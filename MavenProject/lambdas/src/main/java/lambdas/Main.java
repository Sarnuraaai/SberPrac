package lambdas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Sounding> sounds = new ArrayList<>();
        sounds.add(new CatSound());
        sounds.add(new BeeSound());
        sounds.add(new TurkeySound());

        Sounding fishSound = new Sounding() {
            @Override
            public void sound() {
                System.out.println("gulb");
            }
        };

        sounds.add(fishSound);

        Sounding giraffeSound = () -> System.out.println("bleat");

        sounds.add(giraffeSound);

        sounds.add(GooseSound::sound);

        sounds.forEach(Sounding::sound);
    }
}


