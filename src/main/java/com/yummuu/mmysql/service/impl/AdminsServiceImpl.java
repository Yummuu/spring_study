package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Admins;
import com.yummuu.mmysql.repository.AdminsJpaRepository;
import com.yummuu.mmysql.service.AdminsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminsServiceImpl implements AdminsService{
	@Autowired
	private AdminsJpaRepository itemRepository;

	@Override
	public List<Admins> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Admins getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Admins item){
		itemRepository.save(item);
	}
}
