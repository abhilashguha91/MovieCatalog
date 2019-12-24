package io.moviecatalog.userinfoservice.model.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.moviecatalog.userinfoservice.model.entity.UserInfoEntity;

public interface IUserInfoRepository extends MongoRepository<UserInfoEntity,String> {
	
	public List<UserInfoEntity> findByUserInfoId(String userId);
	public List<UserInfoEntity> findByUserName(String userName);
	public List<UserInfoEntity> findByEmail(String userName);

}