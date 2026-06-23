package com.agrocare.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceAlreadyExistsException.class)
    public ResponseEntity<String> handlerResourceAlreadyExists(ResourceAlreadyExistsException exception){
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(exception.getMessage());
    }

}
