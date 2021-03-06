package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.LogLogin;
import com.yummuu.mmysql.service.LogLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/LogLogin")
public class LogLoginController{
	@Autowired
	private LogLoginService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<LogLogin> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public LogLogin info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(LogLogin item){
		itemService.save(item);
	}
}
