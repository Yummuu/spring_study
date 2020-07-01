package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Files;
import com.yummuu.mmysql.service.FilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Files")
public class FilesController{
	@Autowired
	private FilesService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Files> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Files info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Files item){
		itemService.save(item);
	}
}
