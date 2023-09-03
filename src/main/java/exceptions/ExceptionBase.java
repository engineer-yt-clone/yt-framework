package exceptions;

import lombok.Getter;

@Getter
public class ExceptionBase extends RuntimeException {
    private final String message;

    private final Integer code;

    public ExceptionBase(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

    public ResponseBase toJSON(Integer code, String message) {
        return new ResponseBase(code, message);
    }
}
