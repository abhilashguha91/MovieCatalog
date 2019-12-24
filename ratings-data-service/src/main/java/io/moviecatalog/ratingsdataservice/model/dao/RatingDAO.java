package io.moviecatalog.ratingsdataservice.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.moviecatalog.ratingsdataservice.model.entity.RatingEntity;
import io.moviecatalog.ratingsdataservice.model.repository.IRatingRepository;

@Service
@Transactional
public class RatingDAO {
	
	@Autowired
	private IRatingRepository ratingRepository;
	
	public RatingEntity saveRating(RatingEntity ratingEntity) {
		
		return ratingRepository.save(ratingEntity);
	}
	
	public List<RatingEntity> getAllRatingsByUserId(String userId){
		
		return ratingRepository.findByRatingId(userId);
	}
	
	public List<RatingEntity> getAllRatings(){
		
		return ratingRepository.findAll();
	}
	
	public void deleteAllRatings(){
		
		ratingRepository.deleteAll();
	}

}