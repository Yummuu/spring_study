package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Tags;
import com.yummuu.mmysql.service.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Tags")
public class TagsController{
	@Autowired
	private TagsService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Tags> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Tags info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Tags item){
		itemService.save(item);
	}
}
