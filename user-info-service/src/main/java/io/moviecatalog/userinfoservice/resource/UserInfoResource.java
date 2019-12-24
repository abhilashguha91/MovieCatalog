package io.moviecatalog.userinfoservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.moviecatalog.userinfoservice.model.dao.UserInfoDAO;
import io.moviecatalog.userinfoservice.model.entity.UserInfoEntity;

@RestController
public class UserInfoResource {
	
	@Autowired
	UserInfoDAO userInfoDAO;
	
	@RequestMapping(method=RequestMethod.POST, value = "/userInfo")
	public UserInfoEntity saveUserInfo(@RequestBody UserInfoEntity userInfoEntity){
		System.out.println("Inside Save userInfo with userInfoEntity: "+userInfoEntity);
		return userInfoDAO.saveUserInfo(userInfoEntity);
	}
	
	@RequestMapping("userInfo/{userId}")
	public List<UserInfoEntity> getAllUserInfos(@PathVariable("userId") String userId){
		System.out.println("Inside get all userInfos with userId: "+userId);
		return userInfoDAO.getAllUserInfosByUserId(userId);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/userInfo")
	public void deleleteUserInfo(){
		System.out.println("Inside Delete userInfo");
		userInfoDAO.deleteAllUserInfos();
	}
	
	@RequestMapping(value = "/userInfo")
	public List<UserInfoEntity> getAllUserInfo(){
		System.out.println("Inside Delete userInfo");
		return userInfoDAO.getAllUserInfos();
	}

}
