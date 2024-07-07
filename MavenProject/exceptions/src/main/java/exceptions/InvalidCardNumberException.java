package exceptions;

public class InvalidCardNumberException extends BankOnlineException {
    public InvalidCardNumberException() {
        super("Неверный номер карты!");
    }
}
