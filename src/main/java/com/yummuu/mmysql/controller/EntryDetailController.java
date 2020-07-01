package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.EntryDetail;
import com.yummuu.mmysql.service.EntryDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/EntryDetail")
public class EntryDetailController{
	@Autowired
	private EntryDetailService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<EntryDetail> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public EntryDetail info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(EntryDetail item){
		itemService.save(item);
	}
}
