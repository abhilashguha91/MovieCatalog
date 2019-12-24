package io.moviecatalog.moviecatalogservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.moviecatalog.moviecatalogservice.model.dao.CatalogDAO;
import io.moviecatalog.moviecatalogservice.model.entity.CatalogEntity;

@RestController
public class MovieCatalogResource {
	
	@Autowired
	CatalogDAO catalogDAO;
	
	@RequestMapping(method=RequestMethod.POST, value = "/catalog")
	public CatalogEntity saveCatalog(@RequestBody CatalogEntity catalogEntity){
		System.out.println("Inside Save catalog with catalogEntity: "+catalogEntity);
		return catalogDAO.saveCatalog(catalogEntity);
	}
	
	@RequestMapping("catalog/{userId}")
	public List<CatalogEntity> getAllCatalogs(@PathVariable("userId") String userId){
		System.out.println("Inside get all catalogs with userId: "+userId);
		return catalogDAO.getAllCatalogsByUserId(userId);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/catalog")
	public void deleleteCatalog(){
		System.out.println("Inside Delete catalog");
		catalogDAO.deleteAllCatalogs();
	}
	
	@RequestMapping(value = "/catalog")
	public List<CatalogEntity> getAllCatalog(){
		System.out.println("Inside Delete catalog");
		return catalogDAO.getAllCatalogs();
	}
	
	
}
