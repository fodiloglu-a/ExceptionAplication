package com.example.exceptionaplication.dao;

import com.example.exceptionaplication.Model.TurkishWordModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TurkishWordDao extends MongoRepository<TurkishWordModel,Long> {
}
