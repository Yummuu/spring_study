package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.ConfigSms;
import com.yummuu.mmysql.service.ConfigSmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ConfigSms")
public class ConfigSmsController{
	@Autowired
	private ConfigSmsService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<ConfigSms> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public ConfigSms info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(ConfigSms item){
		itemService.save(item);
	}
}
