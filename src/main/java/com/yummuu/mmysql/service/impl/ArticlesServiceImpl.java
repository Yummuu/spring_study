package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Articles;
import com.yummuu.mmysql.repository.ArticlesJpaRepository;
import com.yummuu.mmysql.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticlesServiceImpl implements ArticlesService{
	@Autowired
	private ArticlesJpaRepository itemRepository;

	@Override
	public List<Articles> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Articles getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Articles item){
		itemRepository.save(item);
	}
}
