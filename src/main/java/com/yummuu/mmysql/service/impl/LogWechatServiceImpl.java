package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.LogWechat;
import com.yummuu.mmysql.repository.LogWechatJpaRepository;
import com.yummuu.mmysql.service.LogWechatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogWechatServiceImpl implements LogWechatService{
	@Autowired
	private LogWechatJpaRepository itemRepository;

	@Override
	public List<LogWechat> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public LogWechat getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(LogWechat item){
		itemRepository.save(item);
	}
}
