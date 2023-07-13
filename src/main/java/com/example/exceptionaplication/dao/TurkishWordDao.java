package com.example.exceptionaplication.dao;

import com.example.exceptionaplication.Model.TurkishWordModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TurkishWordDao extends MongoRepository<TurkishWordModel,Long> {
    List<TurkishWordModel> getTurkishWordModelByWordTurkishLikeIgnoreCase(String param);
}
