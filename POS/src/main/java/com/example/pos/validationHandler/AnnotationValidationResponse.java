package com.example.pos.validationHandler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AnnotationValidationResponse extends ResponseEntityExceptionHandler {

    private String message=null;
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatus status, WebRequest request) {

        ex.getBindingResult().getAllErrors().forEach((error) ->{
            message=error.getDefaultMessage();
        });

        return new ResponseEntity<Object>(message, HttpStatus.BAD_REQUEST);
    }

}
