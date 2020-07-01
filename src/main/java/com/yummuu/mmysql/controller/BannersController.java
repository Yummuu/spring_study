package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Banners;
import com.yummuu.mmysql.service.BannersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Banners")
public class BannersController{
	@Autowired
	private BannersService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Banners> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Banners info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Banners item){
		itemService.save(item);
	}
}
