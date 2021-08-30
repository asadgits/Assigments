package com.example.pos.exceptionHandler;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class CustomException extends RuntimeException{

    public  CustomException() {
    }

    public  CustomException(String message){
        super(message);
    }

}
