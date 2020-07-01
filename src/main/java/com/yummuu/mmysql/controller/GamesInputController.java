package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.GamesInput;
import com.yummuu.mmysql.service.GamesInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/GamesInput")
public class GamesInputController{
	@Autowired
	private GamesInputService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<GamesInput> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public GamesInput info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(GamesInput item){
		itemService.save(item);
	}
}
