package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.GoodsSpecs;
import com.yummuu.mmysql.repository.GoodsSpecsJpaRepository;
import com.yummuu.mmysql.service.GoodsSpecsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsSpecsServiceImpl implements GoodsSpecsService{
	@Autowired
	private GoodsSpecsJpaRepository itemRepository;

	@Override
	public List<GoodsSpecs> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public GoodsSpecs getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(GoodsSpecs item){
		itemRepository.save(item);
	}
}
