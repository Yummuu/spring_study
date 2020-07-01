package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.LogView;
import com.yummuu.mmysql.repository.LogViewJpaRepository;
import com.yummuu.mmysql.service.LogViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogViewServiceImpl implements LogViewService{
	@Autowired
	private LogViewJpaRepository itemRepository;

	@Override
	public List<LogView> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public LogView getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(LogView item){
		itemRepository.save(item);
	}
}
