package com.example.exceptionaplication.services;

import com.example.exceptionaplication.mapper.WordDTO;

import java.util.List;

public interface TurkishServices {
    List<WordDTO> getAll();

    List<WordDTO> getByOrLike(String word);

    WordDTO create(WordDTO wordDTO);
}
