package exceptions;

import lombok.Getter;

@Getter
public class NotFoundException extends ExceptionBase {
    private final String message;
    private Integer code = ExceptionCode.NOT_FOUND;

    public NotFoundException(String message) {
        super(ExceptionCode.NOT_FOUND, message);
        this.message = message;
    }

}
