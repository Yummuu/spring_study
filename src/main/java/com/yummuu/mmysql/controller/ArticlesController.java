package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Articles;
import com.yummuu.mmysql.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Articles")
public class ArticlesController{
	@Autowired
	private ArticlesService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Articles> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Articles info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Articles item){
		itemService.save(item);
	}
}
