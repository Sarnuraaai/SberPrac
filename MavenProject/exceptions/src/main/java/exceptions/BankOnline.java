package exceptions;


import java.util.Arrays;
import java.util.List;

public class BankOnline {

    private final List<String> blockedCards = Arrays.asList(
            "1111111111111111",
            "2222222222222222",
            "3333333333333333"
    );

    public void send(String cardNumber, Double money) throws InvalidCardNumberException, BlockedCardException, InvalidValueException, OverLimitException, NullArgumentException {
        if (cardNumber == null || money == null) {
            throw new NullArgumentException();
        }

        if (cardNumber.length() != 16 || !isValidCardNumber(cardNumber)) {
            throw new InvalidCardNumberException();
        }

        if (blockedCards.contains(cardNumber)) {
            throw new BlockedCardException();
        }

        if (money <= 0) {
            throw new InvalidValueException();
        }

        if (money > 50000) {
            throw new OverLimitException();
        }

        System.out.println(money + "рублей переведены на карту " + cardNumber);
    }

    private boolean isValidCardNumber(String s) {
        try {
            Double.parseDouble(s);
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }

        return true;
    }


}
