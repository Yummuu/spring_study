package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Refund;
import com.yummuu.mmysql.service.RefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Refund")
public class RefundController{
	@Autowired
	private RefundService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Refund> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Refund info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Refund item){
		itemService.save(item);
	}
}
