package com.example.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.example.backend.entity.Playlists;

public interface PlaylistsService {

	public List<Playlists> GetPlaylists();
	
	public Optional<Playlists> GetOnePlaylists(String playlist_id);
	
	public Playlists SavePlaylists(Playlists playlist);
	
	public ResponseEntity<Playlists> UpdatePlaylists(String id, Playlists playlist);
	
	public String deletePlaylistsTrack(String id);
}
