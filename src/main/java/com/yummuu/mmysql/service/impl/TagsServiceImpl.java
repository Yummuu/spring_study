package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Tags;
import com.yummuu.mmysql.repository.TagsJpaRepository;
import com.yummuu.mmysql.service.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagsServiceImpl implements TagsService{
	@Autowired
	private TagsJpaRepository itemRepository;

	@Override
	public List<Tags> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Tags getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Tags item){
		itemRepository.save(item);
	}
}
