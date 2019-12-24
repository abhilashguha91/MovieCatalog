package io.moviecatalog.movieinfoservice.model.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.moviecatalog.movieinfoservice.model.entity.MovieEntity;

public interface IMovieRepository extends MongoRepository<MovieEntity,String> {
	
	public List<MovieEntity> findByMovieId(String userId);
	public List<MovieEntity> findByName(String userName);

}