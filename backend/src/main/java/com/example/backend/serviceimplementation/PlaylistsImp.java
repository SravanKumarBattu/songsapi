package com.example.backend.serviceimplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.backend.entity.Playlists;
import com.example.backend.repository.PlaylistsRepository;
import com.example.backend.services.PlaylistsService;

@Service
public class PlaylistsImp implements PlaylistsService{

	@Autowired 
	private PlaylistsRepository repo;
	@Override
	public List<Playlists> GetPlaylists() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<Playlists> GetOnePlaylists(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public Playlists SavePlaylists(Playlists playlist) {
		// TODO Auto-generated method stub
		return repo.save(playlist);
	}

	@Override
	public ResponseEntity<Playlists> UpdatePlaylists(String id, Playlists playlist) {
		// TODO Auto-generated method stub
		Optional<Playlists> old = repo.findById(id);
		if(old.isPresent())
		{
			Playlists update = old.get();
			
			//updating name
			if(playlist.getPlaylistName()!=null)
			{
				update.setPlaylistName(playlist.getPlaylistName());
			}
			else{
				update.setPlaylistName(update.getPlaylistName());
			}
			//updating tracks
			if(playlist.getTracks()!=null) {
				List<String> list= new ArrayList<String>();
				
				list.addAll(update.getTracks());
				list.addAll(playlist.getTracks());
				
				update.setTracks(list);
					
			}
			
			repo.save(update);
			return ResponseEntity.ok(update);
		}
		return null;
		
		
		
	}

	@Override
	public String deletePlaylistsTrack(String id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Deleted";
	}

}
