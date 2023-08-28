package com.engineer.yt.libs.exceptions;

import lombok.Getter;

@Getter
public class ArgumentInvalidException extends RuntimeException {
    private String message;
    private final Integer code = ExceptionCode.BAD_REQUEST;

    public ArgumentInvalidException(String message) {
        this.message = message;
    }
}
