package com.nisum.pos.exceptionHandler;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

@Getter
public class ServiceGeneralException extends RuntimeException{
    private final HttpStatus status;

    @Autowired
    public ServiceGeneralException(String message , HttpStatus status){
        super(message);
        this.status = status;
    }


}
