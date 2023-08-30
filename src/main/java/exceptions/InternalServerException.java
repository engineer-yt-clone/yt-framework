package exceptions;

public class InternalServerException extends RuntimeException {
    private String message;
    private final Integer code = ExceptionCode.INTERNAL_SERVER;

    public InternalServerException(String message) {
        this.message = message;
    }
}
