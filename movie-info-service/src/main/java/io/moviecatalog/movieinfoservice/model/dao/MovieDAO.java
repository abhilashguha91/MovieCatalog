package io.moviecatalog.movieinfoservice.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.moviecatalog.movieinfoservice.model.entity.MovieEntity;
import io.moviecatalog.movieinfoservice.model.repository.IMovieRepository;

@Service
@Transactional
public class MovieDAO {
	
	@Autowired
	private IMovieRepository movieRepository;
	
	public MovieEntity saveMovie(MovieEntity movieEntity) {
		
		return movieRepository.save(movieEntity);
	}
	
	public List<MovieEntity> getAllMoviesByUserId(String userId){
		
		return movieRepository.findByMovieId(userId);
	}
	
	public List<MovieEntity> getAllMovies(){
		
		return movieRepository.findAll();
	}
	
	public void deleteAllMovies(){
		
		movieRepository.deleteAll();
	}

}