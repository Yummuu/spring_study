package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Videos;
import com.yummuu.mmysql.repository.VideosJpaRepository;
import com.yummuu.mmysql.service.VideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideosServiceImpl implements VideosService{
	@Autowired
	private VideosJpaRepository itemRepository;

	@Override
	public List<Videos> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Videos getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Videos item){
		itemRepository.save(item);
	}
}
