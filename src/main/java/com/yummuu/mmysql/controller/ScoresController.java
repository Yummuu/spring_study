package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Scores;
import com.yummuu.mmysql.service.ScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Scores")
public class ScoresController{
	@Autowired
	private ScoresService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Scores> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Scores info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Scores item){
		itemService.save(item);
	}
}
