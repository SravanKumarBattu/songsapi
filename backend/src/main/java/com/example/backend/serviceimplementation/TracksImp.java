package com.example.backend.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.entity.Tracks;
import com.example.backend.repository.TracksRepository;
import com.example.backend.services.TracksService;

@Service
public class TracksImp implements TracksService{

	@Autowired
	private TracksRepository trepo;
	
	@Override
	public List<Tracks> GetTracks() {
		// TODO Auto-generated method stub
		return trepo.findAll();
	}

	@Override
	public Optional<Tracks> GetOneTrack(String _id) {
		// TODO Auto-generated method stub
		return trepo.findById(_id);
	}

	@Override
	public String SaveTrack(Tracks track) {
		// TODO Auto-generated method stub
		trepo.save(track);
		return "Saved Successfully";
	}

}
