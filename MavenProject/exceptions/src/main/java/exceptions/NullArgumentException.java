package exceptions;

public class NullArgumentException extends BankOnlineException {
    public NullArgumentException() {
        super("Одно или несколько полей пусты!");
    }
}
