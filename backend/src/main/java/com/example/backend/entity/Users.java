package com.example.backend.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collection="users")
@AllArgsConstructor
@NoArgsConstructor
public class Users {
	@Id
	private String _id;
	
	private String userName;;
	private String password;
	private List<String> userPlaylists_id;
	private List<String> likedTracks;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<String> getLikedTracks() {
		return likedTracks;
	}
	public void setLikedTracks(List<String> likedTracks) {
		this.likedTracks = likedTracks;
	}
	public List<String> getUserPlaylists_id() {
		return userPlaylists_id;
	}
	public void setUserPlaylists_id(List<String> userPlaylists_id) {
		this.userPlaylists_id = userPlaylists_id;
	}

}
