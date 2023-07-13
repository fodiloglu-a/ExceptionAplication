package com.example.exceptionaplication.exceptio;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionsHandler {

    @ExceptionHandler(CustomerException.class)
    public ResponseEntity customerException(CustomerException customerException){
        ErrorResponse errorResponse=new ErrorResponse();
        errorResponse.setMessage(customerException.message);
        errorResponse.getDetails().add(errorResponse.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(WordNotFountException.class)
    public ResponseEntity wordNotFountException(WordNotFountException wordNotFountException){
        ErrorResponse errorResponse=new ErrorResponse();
        errorResponse.setMessage(wordNotFountException.getMessage());
        errorResponse.getDetails().add(errorResponse.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(WordNotSaveException.class)
    public ResponseEntity wordNotSaveException(WordNotSaveException wordNotSaveException){
        ErrorResponse errorResponse=new ErrorResponse();
        errorResponse.setMessage(wordNotSaveException.getMessage());
        errorResponse.getDetails().add(errorResponse.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.CREATED);
    }
    @ExceptionHandler(WordNotBeNullException.class)
    public ResponseEntity wordNotBeNullException(WordNotBeNullException wordNotBeNullException){
        ErrorResponse errorResponse=new ErrorResponse();
        errorResponse.setMessage(wordNotBeNullException.getMessage());
        errorResponse.getDetails().add(errorResponse.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }




}
