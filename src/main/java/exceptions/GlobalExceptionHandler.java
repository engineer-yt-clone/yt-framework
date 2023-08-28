package com.engineer.yt.libs.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;


@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    protected ResponseEntity<Map<String, String>> handleCorrelationIdMalformedException(
            RuntimeException ex) {
        Map<String, String> map = new HashMap<>();
        map.put("code", "500");
        map.put("message", ex.getMessage());
        return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ArgumentInvalidException.class)
    protected ResponseEntity<ResponseBase> handleArgumentInvalidException(
            ArgumentInvalidException ex) {
        ResponseBase responseBase = new ResponseBase(ex.getCode(), ex.getMessage());
        return new ResponseEntity<>(responseBase, HttpStatus.BAD_REQUEST);
    }

}

