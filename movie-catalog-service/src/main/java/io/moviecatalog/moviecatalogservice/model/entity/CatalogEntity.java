package io.moviecatalog.moviecatalogservice.model.entity;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;

public class CatalogEntity {

	@Id
	private String userId;
	private String userName;
	private Map<String,String> movieRatingMap;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public CatalogEntity(String userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	
	public Map<String, String> getMovieRatingMap() {
		return movieRatingMap;
	}
	public void setMovieRatingMap(Map<String, String> movieRatingMap) {
		this.movieRatingMap = movieRatingMap;
	}
	public void addNewMovieRating(String movieId, String movieRatingId) {
		if(this.movieRatingMap == null)
			this.movieRatingMap = new HashMap<String,String>();
		
		this.movieRatingMap.put(movieId, movieRatingId);
	}
	
	
	
}
