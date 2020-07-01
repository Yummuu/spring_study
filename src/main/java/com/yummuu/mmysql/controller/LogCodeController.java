package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.LogCode;
import com.yummuu.mmysql.service.LogCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/LogCode")
public class LogCodeController{
	@Autowired
	private LogCodeService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<LogCode> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public LogCode info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(LogCode item){
		itemService.save(item);
	}
}
