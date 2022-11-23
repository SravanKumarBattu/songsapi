package com.example.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.entity.Playlists;

@Repository
public interface PlaylistsRepository extends MongoRepository<Playlists, String>  {

}
