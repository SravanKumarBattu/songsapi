package com.example.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.entity.Tracks;
import com.example.backend.services.TracksService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TracksController {
	
	@Autowired
	private TracksService service;
	
	@GetMapping("v1/tracks")
	public List<Tracks> getTracks(){
		return service.GetTracks();
	}
	
	@GetMapping("v1/tracks/{track_id}")
	public Optional<Tracks> getOnetrack(@PathVariable (name="track_id") String track_id) {
		return service.GetOneTrack(track_id);
	}
	
	@PostMapping("v1/tracks")
	public String saveTracks(@RequestBody Tracks track) {
		service.SaveTrack(track);
		return "saved";
	}
}
