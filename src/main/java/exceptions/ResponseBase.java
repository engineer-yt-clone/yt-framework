package com.engineer.yt.libs.exceptions;

public class ResponseBase {
    public String message;

    public Integer code;

    public ResponseBase(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}
