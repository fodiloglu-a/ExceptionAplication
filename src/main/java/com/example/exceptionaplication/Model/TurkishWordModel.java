package com.example.exceptionaplication.Model;

import ch.qos.logback.core.net.ssl.SSL;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data
public class TurkishWordModel  {
    private Long id;

    private String wordTurkish;

    private String wordEnglish;


}
