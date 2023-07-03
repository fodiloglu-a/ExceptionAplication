package com.example.exceptionaplication.Model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data
public class EnglishWordModel   {


    private Long id;

    private String wordTurkish;

    private String wordEnglish;



}
