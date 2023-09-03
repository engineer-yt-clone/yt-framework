package exceptions;

import lombok.Getter;

public class ArgumentOutOfRangeException extends RuntimeException {
    private final String message;
    @Getter
    private final Integer code = ExceptionCode.BAD_REQUEST;

    public ArgumentOutOfRangeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }


}
