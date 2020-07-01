package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.GoodsSpecs;
import com.yummuu.mmysql.service.GoodsSpecsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/GoodsSpecs")
public class GoodsSpecsController{
	@Autowired
	private GoodsSpecsService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<GoodsSpecs> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public GoodsSpecs info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(GoodsSpecs item){
		itemService.save(item);
	}
}
