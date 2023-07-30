package exeption;

public class ArrayIsEmpty extends RuntimeException{
    public ArrayIsEmpty() {
    }

    public ArrayIsEmpty(String message) {
        super(message);
    }

    public ArrayIsEmpty(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrayIsEmpty(Throwable cause) {
        super(cause);
    }

    public ArrayIsEmpty(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
