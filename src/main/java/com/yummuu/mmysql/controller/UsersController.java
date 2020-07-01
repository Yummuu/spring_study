package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Users;
import com.yummuu.mmysql.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Users")
public class UsersController{
	@Autowired
	private UsersService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Users> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Users info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Users item){
		itemService.save(item);
	}
}
