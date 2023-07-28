package exeption;

public class IndexIsLargerOfSizeArray extends RuntimeException{
    public IndexIsLargerOfSizeArray() {
    }

    public IndexIsLargerOfSizeArray(String message) {
        super(message);
    }

    public IndexIsLargerOfSizeArray(String message, Throwable cause) {
        super(message, cause);
    }

    public IndexIsLargerOfSizeArray(Throwable cause) {
        super(cause);
    }

    public IndexIsLargerOfSizeArray(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
