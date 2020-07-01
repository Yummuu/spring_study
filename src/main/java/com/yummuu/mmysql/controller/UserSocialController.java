package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.UserSocial;
import com.yummuu.mmysql.service.UserSocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/UserSocial")
public class UserSocialController{
	@Autowired
	private UserSocialService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<UserSocial> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public UserSocial info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(UserSocial item){
		itemService.save(item);
	}
}
