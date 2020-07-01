package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Games;
import com.yummuu.mmysql.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Games")
public class GamesController{
	@Autowired
	private GamesService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Games> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Games info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Games item){
		itemService.save(item);
	}
}
