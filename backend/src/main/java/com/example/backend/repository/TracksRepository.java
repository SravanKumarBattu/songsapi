package com.example.backend.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.entity.Tracks;

@Repository
public interface TracksRepository extends MongoRepository<Tracks, String>{

}
