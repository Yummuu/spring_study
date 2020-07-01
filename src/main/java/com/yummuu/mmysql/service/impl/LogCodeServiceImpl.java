package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.LogCode;
import com.yummuu.mmysql.repository.LogCodeJpaRepository;
import com.yummuu.mmysql.service.LogCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogCodeServiceImpl implements LogCodeService{
	@Autowired
	private LogCodeJpaRepository itemRepository;

	@Override
	public List<LogCode> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public LogCode getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(LogCode item){
		itemRepository.save(item);
	}
}
