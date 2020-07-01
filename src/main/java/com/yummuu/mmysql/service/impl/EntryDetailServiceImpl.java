package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.EntryDetail;
import com.yummuu.mmysql.repository.EntryDetailJpaRepository;
import com.yummuu.mmysql.service.EntryDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryDetailServiceImpl implements EntryDetailService{
	@Autowired
	private EntryDetailJpaRepository itemRepository;

	@Override
	public List<EntryDetail> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public EntryDetail getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(EntryDetail item){
		itemRepository.save(item);
	}
}
