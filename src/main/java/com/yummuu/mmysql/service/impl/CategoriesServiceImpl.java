package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Categories;
import com.yummuu.mmysql.repository.CategoriesJpaRepository;
import com.yummuu.mmysql.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService{
	@Autowired
	private CategoriesJpaRepository itemRepository;

	@Override
	public List<Categories> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Categories getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Categories item){
		itemRepository.save(item);
	}
}
