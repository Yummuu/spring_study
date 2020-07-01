package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Games;
import com.yummuu.mmysql.repository.GamesJpaRepository;
import com.yummuu.mmysql.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesServiceImpl implements GamesService{
	@Autowired
	private GamesJpaRepository itemRepository;

	@Override
	public List<Games> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Games getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Games item){
		itemRepository.save(item);
	}
}
