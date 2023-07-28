package exeption;

public class ItemIsNull extends RuntimeException{
    public ItemIsNull() {
    }

    public ItemIsNull(String message) {
        super(message);
    }

    public ItemIsNull(String message, Throwable cause) {
        super(message, cause);
    }

    public ItemIsNull(Throwable cause) {
        super(cause);
    }

    public ItemIsNull(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
