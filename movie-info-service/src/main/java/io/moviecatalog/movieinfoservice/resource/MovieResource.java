package io.moviecatalog.movieinfoservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.moviecatalog.movieinfoservice.model.dao.MovieDAO;
import io.moviecatalog.movieinfoservice.model.entity.MovieEntity;

@RestController
public class MovieResource {
	
	@Autowired
	MovieDAO movieDAO;
	
	@RequestMapping(method=RequestMethod.POST, value = "/movie")
	public MovieEntity saveMovie(@RequestBody MovieEntity movieEntity){
		System.out.println("Inside Save movie with movieEntity: "+movieEntity);
		return movieDAO.saveMovie(movieEntity);
	}
	
	@RequestMapping("movie/{userId}")
	public List<MovieEntity> getAllMovies(@PathVariable("userId") String userId){
		System.out.println("Inside get all movies with userId: "+userId);
		return movieDAO.getAllMoviesByUserId(userId);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/movie")
	public void deleleteMovie(){
		System.out.println("Inside Delete movie");
		movieDAO.deleteAllMovies();
	}
	
	@RequestMapping(value = "/movie")
	public List<MovieEntity> getAllMovie(){
		System.out.println("Inside Delete movie");
		return movieDAO.getAllMovies();
	}

}
