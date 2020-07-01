package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Migrations;
import com.yummuu.mmysql.service.MigrationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Migrations")
public class MigrationsController{
	@Autowired
	private MigrationsService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Migrations> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Migrations info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Migrations item){
		itemService.save(item);
	}
}
