package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.LogAlipay;
import com.yummuu.mmysql.service.LogAlipayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/LogAlipay")
public class LogAlipayController{
	@Autowired
	private LogAlipayService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<LogAlipay> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public LogAlipay info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(LogAlipay item){
		itemService.save(item);
	}
}
