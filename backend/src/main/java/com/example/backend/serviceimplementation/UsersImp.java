package com.example.backend.serviceimplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.backend.entity.Users;
import com.example.backend.repository.UserRepository;
import com.example.backend.services.UserService;

@Service
public class UsersImp implements UserService{

	@Autowired
	private UserRepository repo;
	
	@Override
	public String SaveUser(Users User) {
		// TODO Auto-generated method stub
		repo.save(User);
		return "Saved Successfully";
	}

	@Override
	public Optional<Users> GetUser( String _id) {
		return repo.findById(_id);
	}

	@Override
	public ResponseEntity<Users> UpdateUser(String user_id, Users user) {
		// TODO Auto-generated method stub
		Optional<Users> old = repo.findById(user_id);
	
		if(old.isPresent()) {
			Users update = old.get();
			if(user.getUserPlaylists_id()!=null)
			{
				List<String> list = new ArrayList<String>();
				list.addAll(update.getUserPlaylists_id());
				list.addAll(user.getUserPlaylists_id());
				update.setUserPlaylists_id(list);
			}
			if(user.getLikedTracks()!=null) {
				List<String> list= new ArrayList<String>();
				list.addAll(update.getLikedTracks());
				list.addAll(user.getLikedTracks());
				update.setLikedTracks(list);
			}

			repo.save(update);

			return ResponseEntity.ok(update);
		}
		return null;
		
	}

}
