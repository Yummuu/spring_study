package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Videos;
import com.yummuu.mmysql.service.VideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Videos")
public class VideosController{
	@Autowired
	private VideosService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Videos> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Videos info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Videos item){
		itemService.save(item);
	}
}
