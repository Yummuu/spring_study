package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Admins;
import com.yummuu.mmysql.service.AdminsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Admins")
public class AdminsController{
	@Autowired
	private AdminsService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Admins> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Admins info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Admins item){
		itemService.save(item);
	}
}
