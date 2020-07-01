package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.LogAdmin;
import com.yummuu.mmysql.service.LogAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/LogAdmin")
public class LogAdminController{
	@Autowired
	private LogAdminService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<LogAdmin> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public LogAdmin info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(LogAdmin item){
		itemService.save(item);
	}
}
