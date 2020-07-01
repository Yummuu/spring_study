package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.AdminRoles;
import com.yummuu.mmysql.service.AdminRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/AdminRoles")
public class AdminRolesController{
	@Autowired
	private AdminRolesService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<AdminRoles> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public AdminRoles info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(AdminRoles item){
		itemService.save(item);
	}
}
