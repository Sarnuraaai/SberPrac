package tests;

import exceptions.*;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BankOnlineTests {

    @Test
    public void sendInvalidCardNumberTest() {
        Assertions.assertThatThrownBy(() -> new BankOnline().send("1515151515", 15000.0)).isInstanceOf(InvalidCardNumberException.class);
        Assertions.assertThatThrownBy(() -> new BankOnline().send("da142sasd", 3.0)).isInstanceOf(InvalidCardNumberException.class);
    }

    @Test
    public void sendBlockedCardNumberTest() {
        Assertions.assertThatThrownBy(() -> new BankOnline().send("1111111111111111", 150.0)).isInstanceOf(BlockedCardException.class);
    }

    @Test
    public void sendInvalidValueTest() {
        Assertions.assertThatThrownBy(() -> new BankOnline().send("1616161616161616", 0.0)).isInstanceOf(InvalidValueException.class);
        Assertions.assertThatThrownBy(() -> new BankOnline().send("1616161616161616", -1500.0)).isInstanceOf(InvalidValueException.class);
    }

    @Test
    public void sendOverLimitValueTest() {
        Assertions.assertThatThrownBy(() -> new BankOnline().send("1616161616161616", 75000.0)).isInstanceOf(OverLimitException.class);
    }

    @Test
    public void sendNullArgumentTest() {
        Assertions.assertThatThrownBy(() -> new BankOnline().send(null, 15.0)).isInstanceOf(NullArgumentException.class);
        Assertions.assertThatThrownBy(() -> new BankOnline().send("1616161616161616", null)).isInstanceOf(NullArgumentException.class);
    }
}
