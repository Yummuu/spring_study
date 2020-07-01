package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.LogAdmin;
import com.yummuu.mmysql.repository.LogAdminJpaRepository;
import com.yummuu.mmysql.service.LogAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogAdminServiceImpl implements LogAdminService{
	@Autowired
	private LogAdminJpaRepository itemRepository;

	@Override
	public List<LogAdmin> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public LogAdmin getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(LogAdmin item){
		itemRepository.save(item);
	}
}
