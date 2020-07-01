package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Certs;
import com.yummuu.mmysql.repository.CertsJpaRepository;
import com.yummuu.mmysql.service.CertsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertsServiceImpl implements CertsService{
	@Autowired
	private CertsJpaRepository itemRepository;

	@Override
	public List<Certs> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Certs getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Certs item){
		itemRepository.save(item);
	}
}
