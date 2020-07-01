package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Goods;
import com.yummuu.mmysql.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Goods")
public class GoodsController{
	@Autowired
	private GoodsService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Goods> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Goods info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Goods item){
		itemService.save(item);
	}
}
