package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.ConfigQiniu;
import com.yummuu.mmysql.service.ConfigQiniuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ConfigQiniu")
public class ConfigQiniuController{
	@Autowired
	private ConfigQiniuService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<ConfigQiniu> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public ConfigQiniu info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(ConfigQiniu item){
		itemService.save(item);
	}
}
