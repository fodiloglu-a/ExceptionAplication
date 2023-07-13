package com.example.exceptionaplication.exceptio;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WordNotFountException extends Exception{
    public WordNotFountException(String messsage){
        super(messsage);
    }

}
