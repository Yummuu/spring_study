package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Goods;
import com.yummuu.mmysql.repository.GoodsJpaRepository;
import com.yummuu.mmysql.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService{
	@Autowired
	private GoodsJpaRepository itemRepository;

	@Override
	public List<Goods> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Goods getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Goods item){
		itemRepository.save(item);
	}
}
