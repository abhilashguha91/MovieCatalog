package io.moviecatalog.ratingsdataservice.model.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.moviecatalog.ratingsdataservice.model.entity.RatingEntity;

public interface IRatingRepository extends MongoRepository<RatingEntity,String> {
	
	public List<RatingEntity> findByRatingId(String ratingId);

}
