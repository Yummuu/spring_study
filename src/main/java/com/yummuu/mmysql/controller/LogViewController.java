package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.LogView;
import com.yummuu.mmysql.service.LogViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/LogView")
public class LogViewController{
	@Autowired
	private LogViewService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<LogView> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public LogView info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(LogView item){
		itemService.save(item);
	}
}
