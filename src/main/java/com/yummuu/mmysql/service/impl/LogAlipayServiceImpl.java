package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.LogAlipay;
import com.yummuu.mmysql.repository.LogAlipayJpaRepository;
import com.yummuu.mmysql.service.LogAlipayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogAlipayServiceImpl implements LogAlipayService{
	@Autowired
	private LogAlipayJpaRepository itemRepository;

	@Override
	public List<LogAlipay> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public LogAlipay getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(LogAlipay item){
		itemRepository.save(item);
	}
}
