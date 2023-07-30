package exeption;

public class NotFoundExeptoin extends RuntimeException{
    public NotFoundExeptoin() {
    }

    public NotFoundExeptoin(String message) {
        super(message);
    }

    public NotFoundExeptoin(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundExeptoin(Throwable cause) {
        super(cause);
    }

    public NotFoundExeptoin(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
