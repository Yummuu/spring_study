package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Certs;
import com.yummuu.mmysql.service.CertsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Certs")
public class CertsController{
	@Autowired
	private CertsService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Certs> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Certs info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Certs item){
		itemService.save(item);
	}
}
