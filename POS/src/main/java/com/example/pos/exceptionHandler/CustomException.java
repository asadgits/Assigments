package com.example.pos.exceptionHandler;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

@Getter
public class CustomException extends RuntimeException{
    private HttpStatus status;

    @Autowired
    public  CustomException(String message , HttpStatus status){
        super(message);
        this.status = status;
    }


}
