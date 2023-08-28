package com.engineer.yt.libs.exceptions;

public class ArgumentOutOfRangeException extends RuntimeException {
    private String message;
    private final Integer code = ExceptionCode.BAD_REQUEST;

    public ArgumentOutOfRangeException(String message) {
        this.message = message;
    }
}
