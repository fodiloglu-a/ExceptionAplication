package com.example.exceptionaplication.exceptio;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WordNotSaveException extends Exception{
    public WordNotSaveException(String message){
        super(message);
    }

}
