package com.example.exceptionaplication.dao;

import com.example.exceptionaplication.Model.EnglishWordModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EnglishWordDao extends MongoRepository<EnglishWordModel,Long>{


    List<EnglishWordModel> getEnglishWordModelByWordEnglishLike(String englishWord);
}
