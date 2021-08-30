package com.example.pos.exceptionHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class MainExceptionHandler {

    @Autowired
    Throwable throwable;

    @ExceptionHandler(value = CustomException.class)
    public ResponseEntity handleNullPointer(CustomException customException){
        
        return new ResponseEntity<>( customException.getMessage() ,  HttpStatus.BAD_REQUEST);
    }

}
