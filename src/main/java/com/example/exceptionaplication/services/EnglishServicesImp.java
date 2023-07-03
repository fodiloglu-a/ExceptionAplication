package com.example.exceptionaplication.services;

import com.example.exceptionaplication.Model.EnglishWordModel;
import com.example.exceptionaplication.dao.EnglishWordDao;
import com.example.exceptionaplication.mapper.WordDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnglishServicesImp implements EnglishServices{

    private final EnglishWordDao englishWordDao;
    private final ModelMapper modelMapper;

    public EnglishServicesImp(EnglishWordDao englishWordDao, ModelMapper modelMapper) {
        this.englishWordDao = englishWordDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<WordDTO> getAll() {
        List<EnglishWordModel> englishWordModels=englishWordDao.findAll();
        List<WordDTO> wordDTOS=new ArrayList<>();

        for (EnglishWordModel englishWordModel : englishWordModels) {
            wordDTOS.add(modelMapper.map(englishWordModel, WordDTO.class));

        }

        return wordDTOS;
    }

    @Override
    public List<WordDTO> getByOrLike(String word) {
        List<EnglishWordModel> englishWordModels=englishWordDao.getEnglishWordModelByWordEnglishLike(word);
        List<WordDTO> wordDTOS=new ArrayList<>();
        for (EnglishWordModel englishWordModel : englishWordModels) {
            wordDTOS.add(modelMapper.map(englishWordModel,WordDTO.class));
        }
        return wordDTOS;
    }

    @Override
    public WordDTO create(WordDTO wordDTO) {
        EnglishWordModel englishWordModel=modelMapper.map(wordDTO,EnglishWordModel.class);

        englishWordDao.save(englishWordModel);


        return wordDTO;
    }
}
