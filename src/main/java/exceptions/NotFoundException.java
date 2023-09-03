package exceptions;

import lombok.Getter;

@Getter
public class NotFoundException {
    private final String message;
    private Integer code = ExceptionCode.NOT_FOUND;

    public NotFoundException(String message) {
        this.message = message;
    }

}
