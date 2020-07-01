package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Partners;
import com.yummuu.mmysql.repository.PartnersJpaRepository;
import com.yummuu.mmysql.service.PartnersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartnersServiceImpl implements PartnersService{
	@Autowired
	private PartnersJpaRepository itemRepository;

	@Override
	public List<Partners> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Partners getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Partners item){
		itemRepository.save(item);
	}
}
