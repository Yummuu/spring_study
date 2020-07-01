package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.UserProfile;
import com.yummuu.mmysql.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/UserProfile")
public class UserProfileController{
	@Autowired
	private UserProfileService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<UserProfile> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public UserProfile info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(UserProfile item){
		itemService.save(item);
	}
}
