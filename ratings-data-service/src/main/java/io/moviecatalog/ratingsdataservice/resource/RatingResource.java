package io.moviecatalog.ratingsdataservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.moviecatalog.ratingsdataservice.model.dao.RatingDAO;
import io.moviecatalog.ratingsdataservice.model.entity.RatingEntity;

@RestController
public class RatingResource {
	
	@Autowired
	RatingDAO ratingDAO;
	
	@RequestMapping(method=RequestMethod.POST, value = "/rating")
	public RatingEntity saveRating(@RequestBody RatingEntity ratingEntity){
		System.out.println("Inside Save rating with ratingEntity: "+ratingEntity);
		return ratingDAO.saveRating(ratingEntity);
	}
	
	@RequestMapping("rating/{userId}")
	public List<RatingEntity> getAllRatings(@PathVariable("userId") String userId){
		System.out.println("Inside get all ratings with userId: "+userId);
		return ratingDAO.getAllRatingsByUserId(userId);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/rating")
	public void deleleteRating(){
		System.out.println("Inside Delete rating");
		ratingDAO.deleteAllRatings();
	}
	
	@RequestMapping(value = "/rating")
	public List<RatingEntity> getAllRating(){
		System.out.println("Inside Delete rating");
		return ratingDAO.getAllRatings();
	}

}

