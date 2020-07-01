package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Races;
import com.yummuu.mmysql.service.RacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Races")
public class RacesController{
	@Autowired
	private RacesService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Races> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Races info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Races item){
		itemService.save(item);
	}
}
