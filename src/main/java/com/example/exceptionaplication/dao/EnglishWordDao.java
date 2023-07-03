package com.example.exceptionaplication.dao;

import com.example.exceptionaplication.Model.EnglishWordModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EnglishWordDao extends MongoRepository<EnglishWordModel,Long> {
}
