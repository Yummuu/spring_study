package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Entry;
import com.yummuu.mmysql.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Entry")
public class EntryController{
	@Autowired
	private EntryService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Entry> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Entry info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Entry item){
		itemService.save(item);
	}
}
