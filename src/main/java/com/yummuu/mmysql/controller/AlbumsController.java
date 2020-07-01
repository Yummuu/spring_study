package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Albums;
import com.yummuu.mmysql.service.AlbumsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Albums")
public class AlbumsController{
	@Autowired
	private AlbumsService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Albums> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Albums info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Albums item){
		itemService.save(item);
	}
}
