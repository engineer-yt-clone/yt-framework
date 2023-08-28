package com.engineer.yt.libs.exceptions;

public class ExceptionBase extends Exception {
    public String message;

    public Integer code;

    public ExceptionBase(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

    public ResponseBase toJSON(Integer code, String message) {
        ResponseBase responseBase = new ResponseBase(code, message);
        return responseBase;
    }
}
