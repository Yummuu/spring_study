package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.GamesInput;
import com.yummuu.mmysql.repository.GamesInputJpaRepository;
import com.yummuu.mmysql.service.GamesInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesInputServiceImpl implements GamesInputService{
	@Autowired
	private GamesInputJpaRepository itemRepository;

	@Override
	public List<GamesInput> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public GamesInput getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(GamesInput item){
		itemRepository.save(item);
	}
}
