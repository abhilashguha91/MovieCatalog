package io.moviecatalog.ratingsdataservice.model.entity;

import org.springframework.data.annotation.Id;

public class RatingEntity {
	
	@Id
	private String ratingId;
	private Double comprehensiveating;
	private Double directionRating;
	private Double screenPlayRating;
	private Double plotRating;
	private Double performanceRating;
	
	public RatingEntity(String ratingId, Double comprehensiveating, Double directionRating, Double screenPlayRating,
			Double plotRating, Double performanceRating) {
		super();
		this.ratingId = ratingId;
		this.comprehensiveating = comprehensiveating;
		this.directionRating = directionRating;
		this.screenPlayRating = screenPlayRating;
		this.plotRating = plotRating;
		this.performanceRating = performanceRating;
	}
	public String getRatingId() {
		return ratingId;
	}
	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}
	public Double getComprehensiveating() {
		return comprehensiveating;
	}
	public void setComprehensiveating(Double comprehensiveating) {
		this.comprehensiveating = comprehensiveating;
	}
	public Double getDirectionRating() {
		return directionRating;
	}
	public void setDirectionRating(Double directionRating) {
		this.directionRating = directionRating;
	}
	public Double getScreenPlayRating() {
		return screenPlayRating;
	}
	public void setScreenPlayRating(Double screenPlayRating) {
		this.screenPlayRating = screenPlayRating;
	}
	public Double getPlotRating() {
		return plotRating;
	}
	public void setPlotRating(Double plotRating) {
		this.plotRating = plotRating;
	}
	public Double getPerformanceRating() {
		return performanceRating;
	}
	public void setPerformanceRating(Double performanceRating) {
		this.performanceRating = performanceRating;
	}

}
