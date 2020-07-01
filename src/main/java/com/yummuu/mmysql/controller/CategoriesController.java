package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Categories;
import com.yummuu.mmysql.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Categories")
public class CategoriesController{
	@Autowired
	private CategoriesService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Categories> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Categories info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Categories item){
		itemService.save(item);
	}
}
