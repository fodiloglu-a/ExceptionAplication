package com.example.exceptionaplication.exceptio;

public class CustomerException extends Exception{
    public String message;
    public CustomerException(String message){
        super(message);
        this.message=message;
    }
}
