package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Scores;
import com.yummuu.mmysql.repository.ScoresJpaRepository;
import com.yummuu.mmysql.service.ScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoresServiceImpl implements ScoresService{
	@Autowired
	private ScoresJpaRepository itemRepository;

	@Override
	public List<Scores> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Scores getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Scores item){
		itemRepository.save(item);
	}
}
