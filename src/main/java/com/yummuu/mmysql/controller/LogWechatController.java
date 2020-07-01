package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.LogWechat;
import com.yummuu.mmysql.service.LogWechatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/LogWechat")
public class LogWechatController{
	@Autowired
	private LogWechatService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<LogWechat> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public LogWechat info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(LogWechat item){
		itemService.save(item);
	}
}
