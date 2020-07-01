package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Notifications;
import com.yummuu.mmysql.service.NotificationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Notifications")
public class NotificationsController{
	@Autowired
	private NotificationsService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Notifications> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Notifications info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Notifications item){
		itemService.save(item);
	}
}
