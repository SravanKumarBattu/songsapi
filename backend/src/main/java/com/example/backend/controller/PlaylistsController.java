package com.example.backend.controller;

import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.entity.Playlists;
import com.example.backend.services.PlaylistsService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PlaylistsController {

	@Autowired
	private PlaylistsService service;
	
	@GetMapping("/v1/playlists")
	public List<Playlists> getPlaylists(){
		return service.GetPlaylists();
	}
	
	@GetMapping("/v1/playlists/{playlist_id}")
	public Optional<Playlists> getOnePlaylists(@PathVariable (name="playlist_id") String playlist_id) {
		return service.GetOnePlaylists(playlist_id);
	}
	
	@PostMapping("/v1/playlists")
	public String savePlaylists(@RequestBody Playlists playlist) {
		service.SavePlaylists(playlist);
		return "saved";
	}
	
	
	@PatchMapping("/v1/playlists/{playlists_id}")
	public ResponseEntity<Playlists> updatePlaylists(@PathVariable (name="playlists_id") String id, @RequestBody Playlists playlist) {
		
		return service.UpdatePlaylists(id,playlist);
		 
	}
	
	@DeleteMapping("/v1/playlists/{playlist_id}")
	public String deletePlayliststrack(@PathVariable (name="playlist_id") String id) {
		return service.deletePlaylistsTrack(id);
	}
	
}
