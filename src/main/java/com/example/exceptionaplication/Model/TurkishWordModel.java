package com.example.exceptionaplication.Model;

import ch.qos.logback.core.net.ssl.SSL;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class TurkishWordModel extends AbstractWordModel{
    @NonNull
    private String wordTurkish;
    @NonNull
    private String wordEnglish;

}
