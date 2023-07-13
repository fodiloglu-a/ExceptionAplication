package com.example.exceptionaplication.services;


import com.example.exceptionaplication.exceptio.CustomerException;
import com.example.exceptionaplication.mapper.WordDTO;

import java.util.List;

public interface EnglishServices {
    List<WordDTO> getAll();
    List<WordDTO> getByOrLike(String englishWord);

    WordDTO create(WordDTO wordDTO);
}
