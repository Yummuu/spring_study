package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Migrations;
import com.yummuu.mmysql.repository.MigrationsJpaRepository;
import com.yummuu.mmysql.service.MigrationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MigrationsServiceImpl implements MigrationsService{
	@Autowired
	private MigrationsJpaRepository itemRepository;

	@Override
	public List<Migrations> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Migrations getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Migrations item){
		itemRepository.save(item);
	}
}
