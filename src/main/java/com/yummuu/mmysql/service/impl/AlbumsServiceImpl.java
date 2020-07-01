package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Albums;
import com.yummuu.mmysql.repository.AlbumsJpaRepository;
import com.yummuu.mmysql.service.AlbumsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumsServiceImpl implements AlbumsService{
	@Autowired
	private AlbumsJpaRepository itemRepository;

	@Override
	public List<Albums> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Albums getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Albums item){
		itemRepository.save(item);
	}
}
