package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.ConfigSms;
import com.yummuu.mmysql.repository.ConfigSmsJpaRepository;
import com.yummuu.mmysql.service.ConfigSmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigSmsServiceImpl implements ConfigSmsService{
	@Autowired
	private ConfigSmsJpaRepository itemRepository;

	@Override
	public List<ConfigSms> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public ConfigSms getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(ConfigSms item){
		itemRepository.save(item);
	}
}
