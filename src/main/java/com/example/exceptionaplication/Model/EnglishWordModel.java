package com.example.exceptionaplication.Model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class EnglishWordModel extends AbstractWordModel {
    @NonNull
    private String wordTurkish;
    @NonNull
    private String wordEnglish;



}
