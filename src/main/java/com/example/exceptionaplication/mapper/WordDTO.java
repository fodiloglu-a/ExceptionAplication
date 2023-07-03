package com.example.exceptionaplication.mapper;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WordDTO {
    private Long id;
    private String wordTurkish;
    private String wordEnglish;
}
