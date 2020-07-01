package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Races;
import com.yummuu.mmysql.repository.RacesJpaRepository;
import com.yummuu.mmysql.service.RacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RacesServiceImpl implements RacesService{
	@Autowired
	private RacesJpaRepository itemRepository;

	@Override
	public List<Races> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Races getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Races item){
		itemRepository.save(item);
	}
}
