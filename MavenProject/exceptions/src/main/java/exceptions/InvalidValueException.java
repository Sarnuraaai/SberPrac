package exceptions;

public class InvalidValueException extends BankOnlineException {
    public InvalidValueException() {
        super("Неверная сумма!");
    }
}
