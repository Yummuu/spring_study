package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.GoodsSpecsValue;
import com.yummuu.mmysql.service.GoodsSpecsValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/GoodsSpecsValue")
public class GoodsSpecsValueController{
	@Autowired
	private GoodsSpecsValueService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<GoodsSpecsValue> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public GoodsSpecsValue info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(GoodsSpecsValue item){
		itemService.save(item);
	}
}
