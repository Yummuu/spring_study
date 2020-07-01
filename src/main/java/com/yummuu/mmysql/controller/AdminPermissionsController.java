package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.AdminPermissions;
import com.yummuu.mmysql.service.AdminPermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/AdminPermissions")
public class AdminPermissionsController{
	@Autowired
	private AdminPermissionsService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<AdminPermissions> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public AdminPermissions info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(AdminPermissions item){
		itemService.save(item);
	}
}
