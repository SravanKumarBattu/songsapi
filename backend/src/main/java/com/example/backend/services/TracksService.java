package com.example.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.backend.entity.Tracks;

@Service
public interface TracksService {

	public List<Tracks> GetTracks();

	public Optional<Tracks> GetOneTrack(String _id);

	public String SaveTrack(Tracks track);
}
