package com.example.exceptionaplication.dao;

import com.example.exceptionaplication.Model.TurkishWordModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurkishWordDao extends MongoRepository<TurkishWordModel,Long> {
}
