package exceptions;

import lombok.Getter;

@Getter
public class ArgumentInvalidException extends RuntimeException {
    private final String message;
    private static final Integer code = ExceptionCode.BAD_REQUEST;

    public ArgumentInvalidException(String message) {
        this.message = message;
    }
}
