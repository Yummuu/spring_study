package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.LogLogin;
import com.yummuu.mmysql.repository.LogLoginJpaRepository;
import com.yummuu.mmysql.service.LogLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogLoginServiceImpl implements LogLoginService{
	@Autowired
	private LogLoginJpaRepository itemRepository;

	@Override
	public List<LogLogin> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public LogLogin getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(LogLogin item){
		itemRepository.save(item);
	}
}
