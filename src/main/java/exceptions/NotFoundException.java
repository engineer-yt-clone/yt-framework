package com.engineer.yt.libs.exceptions;

public class NotFoundException {
    private String message;
    private Integer code = ExceptionCode.NOT_FOUND;

    public NotFoundException(String message) {
        this.message = message;
    }

}
