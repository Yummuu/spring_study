package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Entry;
import com.yummuu.mmysql.repository.EntryJpaRepository;
import com.yummuu.mmysql.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryServiceImpl implements EntryService{
	@Autowired
	private EntryJpaRepository itemRepository;

	@Override
	public List<Entry> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Entry getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Entry item){
		itemRepository.save(item);
	}
}
