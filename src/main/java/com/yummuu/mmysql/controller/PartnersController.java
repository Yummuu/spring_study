package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Partners;
import com.yummuu.mmysql.service.PartnersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Partners")
public class PartnersController{
	@Autowired
	private PartnersService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Partners> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Partners info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Partners item){
		itemService.save(item);
	}
}
