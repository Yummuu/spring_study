package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Refund;
import com.yummuu.mmysql.repository.RefundJpaRepository;
import com.yummuu.mmysql.service.RefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RefundServiceImpl implements RefundService{
	@Autowired
	private RefundJpaRepository itemRepository;

	@Override
	public List<Refund> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Refund getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Refund item){
		itemRepository.save(item);
	}
}
