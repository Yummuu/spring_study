package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.ScoresDetail;
import com.yummuu.mmysql.repository.ScoresDetailJpaRepository;
import com.yummuu.mmysql.service.ScoresDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoresDetailServiceImpl implements ScoresDetailService{
	@Autowired
	private ScoresDetailJpaRepository itemRepository;

	@Override
	public List<ScoresDetail> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public ScoresDetail getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(ScoresDetail item){
		itemRepository.save(item);
	}
}
