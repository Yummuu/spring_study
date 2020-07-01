package com.yummuu.mmysql.controller;

import com.yummuu.mmysql.model.Order;
import com.yummuu.mmysql.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Order")
public class OrderController{
	@Autowired
	private OrderService itemService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public List<Order> index(){
		return itemService.findAll();
	}

	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public Order info(long id){
		return itemService.getOne(id);
	}

	@RequestMapping(value = "/save",method = RequestMethod.PUT)
	public void save(Order item){
		itemService.save(item);
	}
}
