package exceptions;

public class BlockedCardException extends BankOnlineException {
    public BlockedCardException() {
        super("Карта заблокирована!");
    }
}
