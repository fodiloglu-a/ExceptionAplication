package com.example.exceptionaplication.services;

import com.example.exceptionaplication.Model.EnglishWordModel;
import com.example.exceptionaplication.dao.EnglishWordDao;

import com.example.exceptionaplication.exceptio.CustomerException;
import com.example.exceptionaplication.exceptio.WordNotBeNullException;
import com.example.exceptionaplication.exceptio.WordNotFountException;
import com.example.exceptionaplication.exceptio.WordNotSaveException;
import com.example.exceptionaplication.mapper.WordDTO;

import lombok.SneakyThrows;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EnglishServicesImp implements EnglishServices {

    private final EnglishWordDao englishWordDao;
    private final ModelMapper modelMapper;


    public EnglishServicesImp(EnglishWordDao englishWordDao, ModelMapper modelMapper) {
        this.englishWordDao = englishWordDao;
        this.modelMapper = modelMapper;
    }


    @Override
    @SneakyThrows
    public List<WordDTO> getAll() {

        List<WordDTO> wordDTOS = new ArrayList<>();

        try {
            List<EnglishWordModel> englishWordModels = englishWordDao.findAll();
            englishWordModels.stream().forEach(englishWordModel -> wordDTOS.add(modelMapper.map(englishWordModel, WordDTO.class)));
        } catch (Exception e) {
            throw new CustomerException("Bad Request for get all english word!!!");
        }

        return wordDTOS;
    }

    @Override
    @SneakyThrows
    public List<WordDTO> getByOrLike(String word) {
        List<WordDTO> wordDTOS = new ArrayList<>();
        try {
            List<EnglishWordModel> englishWordModels = englishWordDao.getEnglishWordModelByWordEnglishLike(word);
            englishWordModels.stream().forEach(englishWordModel -> wordDTOS.add(modelMapper.map(englishWordModel,WordDTO.class)));
        } catch (Exception e) {
            throw new WordNotFountException("Not fount for word:" + word);
        }
        if (wordDTOS.isEmpty() || wordDTOS.size() == 0 || wordDTOS == null) {
            throw new WordNotFountException("Not fount for word:" + word);
        }
        return wordDTOS;
    }

    @Override
    @SneakyThrows
    public WordDTO create(WordDTO wordDTO) {
        if (wordDTO.getWordEnglish().isEmpty() || wordDTO.getWordTurkish().isEmpty() || wordDTO.getWordTurkish().isBlank() || wordDTO.getWordEnglish().isBlank()) {
            String message = "Word value must not be null value!!! ";
            throw new WordNotBeNullException(message);
        }
        try {
            EnglishWordModel englishWordModel = modelMapper.map(wordDTO, EnglishWordModel.class);
            englishWordDao.save(englishWordModel);
        } catch (Exception e) {
            throw new WordNotSaveException(wordDTO.getWordEnglish() + ": This word not save!!!");

        }

        return wordDTO;
    }
}
