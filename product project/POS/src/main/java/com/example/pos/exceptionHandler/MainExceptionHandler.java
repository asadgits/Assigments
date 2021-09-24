package com.example.pos.exceptionHandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class MainExceptionHandler {

    @ExceptionHandler(value = ServiceGeneralException.class)
    public ResponseEntity handleNullPointer(ServiceGeneralException serviceGeneralException) {

        return new ResponseEntity(serviceGeneralException.getMessage() , serviceGeneralException.getStatus());
    }

}
