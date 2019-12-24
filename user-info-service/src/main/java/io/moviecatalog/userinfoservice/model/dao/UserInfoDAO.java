package io.moviecatalog.userinfoservice.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.moviecatalog.userinfoservice.model.entity.UserInfoEntity;
import io.moviecatalog.userinfoservice.model.repository.IUserInfoRepository;

@Service
@Transactional
public class UserInfoDAO {
	
	@Autowired
	private IUserInfoRepository userInfoRepository;
	
	public UserInfoEntity saveUserInfo(UserInfoEntity userInfoEntity) {
		
		return userInfoRepository.save(userInfoEntity);
	}
	
	public List<UserInfoEntity> getAllUserInfosByUserId(String userId){
		
		return userInfoRepository.findByUserInfoId(userId);
	}
	
	public List<UserInfoEntity> getAllUserInfos(){
		
		return userInfoRepository.findAll();
	}
	
	public void deleteAllUserInfos(){
		
		userInfoRepository.deleteAll();
	}

}