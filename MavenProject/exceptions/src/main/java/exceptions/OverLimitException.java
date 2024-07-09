package exceptions;

public class OverLimitException extends BankOnlineException {
    public OverLimitException() {
        super("Сумма перевода превышает лимит!");
    }
}
