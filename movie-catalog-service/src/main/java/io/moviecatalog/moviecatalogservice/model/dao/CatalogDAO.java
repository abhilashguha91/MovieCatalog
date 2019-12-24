package io.moviecatalog.moviecatalogservice.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.moviecatalog.moviecatalogservice.model.entity.CatalogEntity;
import io.moviecatalog.moviecatalogservice.model.repository.ICatalogRepository;

@Service
@Transactional
public class CatalogDAO {
	
	@Autowired
	private ICatalogRepository catalogRepository;
	
	public CatalogEntity saveCatalog(CatalogEntity catalogEntity) {
		
		return catalogRepository.save(catalogEntity);
	}
	
	public List<CatalogEntity> getAllCatalogsByUserId(String userId){
		
		return catalogRepository.findByUserId(userId);
	}
	
	public List<CatalogEntity> getAllCatalogs(){
		
		return catalogRepository.findAll();
	}
	
	public void deleteAllCatalogs(){
		
		catalogRepository.deleteAll();
	}

}
