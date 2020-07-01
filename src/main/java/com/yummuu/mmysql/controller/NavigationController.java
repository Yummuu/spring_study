package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Navigation;
import com.yummuu.mmysql.service.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Navigation")
public class NavigationController{
	@Autowired
	private NavigationService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Navigation> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Navigation info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Navigation item){
		itemService.save(item);
	}
}
