#API Documentation

##User info
=========
#Attributes => userName,password, Playlists_id[],Likedtracks[],
	
###user with id
 GET http://localhost:9091/v1/users/{user_id}
###save user
 POST http://localhost:9091/v1/users/


##Playlists
=========
#Attributes => playlistName,tracks_id[]

###Create playlist
	POST http://localhost:9091/v1/playlists

###Get all playlist
	GET http://localhost:9091/v1/playlists

###Get playlist by id  
	GET http://localhost:9091/v1/playlists/{playlist_id}

###Change playlist details
	Patch http://localhost:9091/v1/playlists/{playlist_id}

###Update playlist tracks
	Patch http://localhost:9091/v1/playlists/{playlist_id}/tracks

###Delete playlist
	 DELETE http://localhost:9091/v1/playlists/{playlist_id}


##TRACKS
======
#Attributes => Name,Singer,imgSrc,Audiosource

###GET  http://localhost:9091/v1/tracks
###POST http://localhost:9091/v1/tracks
###GET  http://localhost:9091/v1/tracks/{id}
