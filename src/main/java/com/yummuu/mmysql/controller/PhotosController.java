package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Photos;
import com.yummuu.mmysql.service.PhotosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Photos")
public class PhotosController{
	@Autowired
	private PhotosService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Photos> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Photos info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Photos item){
		itemService.save(item);
	}
}
