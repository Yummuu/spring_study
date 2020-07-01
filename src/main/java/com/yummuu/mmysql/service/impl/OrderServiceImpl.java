package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Order;
import com.yummuu.mmysql.repository.OrderJpaRepository;
import com.yummuu.mmysql.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderJpaRepository itemRepository;

	@Override
	public List<Order> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Order getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Order item){
		itemRepository.save(item);
	}
}
