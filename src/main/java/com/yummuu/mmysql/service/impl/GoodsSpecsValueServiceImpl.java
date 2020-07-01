package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.GoodsSpecsValue;
import com.yummuu.mmysql.repository.GoodsSpecsValueJpaRepository;
import com.yummuu.mmysql.service.GoodsSpecsValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsSpecsValueServiceImpl implements GoodsSpecsValueService{
	@Autowired
	private GoodsSpecsValueJpaRepository itemRepository;

	@Override
	public List<GoodsSpecsValue> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public GoodsSpecsValue getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(GoodsSpecsValue item){
		itemRepository.save(item);
	}
}
