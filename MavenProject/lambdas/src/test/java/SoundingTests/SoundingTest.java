package SoundingTests;

import lambdas.*;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;

public class SoundingTest {
    @Test
    public void soundingTest() {
        ArrayList<Sounding> sounds = new ArrayList<>();
        ArrayList<String> soundsTest = new ArrayList<>();
        soundsTest.add("Meow");
        soundsTest.add("buzz");
        soundsTest.add("gobble");
        soundsTest.add("gulb");
        soundsTest.add("bleat");
        soundsTest.add("honk");
        sounds.add(new CatSound());
        sounds.add(new BeeSound());
        sounds.add(new TurkeySound());

        Sounding fishSound = new Sounding() {
            @Override
            public String sound() {
                return "gulb";
            }
        };

        sounds.add(fishSound);

        Sounding giraffeSound = () -> "bleat";

        sounds.add(giraffeSound);

        sounds.add(GooseSound::sound);

        for (int count = 0; count < soundsTest.size(); count++) {
            Assertions.assertThat(sounds.get(count).sound()).isEqualTo(soundsTest.get(count));
        }
    }
}
