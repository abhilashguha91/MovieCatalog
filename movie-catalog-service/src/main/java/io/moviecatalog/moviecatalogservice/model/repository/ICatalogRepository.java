package io.moviecatalog.moviecatalogservice.model.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.moviecatalog.moviecatalogservice.model.entity.CatalogEntity;

public interface ICatalogRepository extends MongoRepository<CatalogEntity,String> {
	
	public List<CatalogEntity> findByUserId(String userId);
	public List<CatalogEntity> findByUserName(String userName);

}
