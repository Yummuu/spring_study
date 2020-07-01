package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.ScoresDetail;
import com.yummuu.mmysql.service.ScoresDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ScoresDetail")
public class ScoresDetailController{
	@Autowired
	private ScoresDetailService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<ScoresDetail> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public ScoresDetail info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(ScoresDetail item){
		itemService.save(item);
	}
}
