package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.ConfigQiniu;
import com.yummuu.mmysql.repository.ConfigQiniuJpaRepository;
import com.yummuu.mmysql.service.ConfigQiniuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigQiniuServiceImpl implements ConfigQiniuService{
	@Autowired
	private ConfigQiniuJpaRepository itemRepository;

	@Override
	public List<ConfigQiniu> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public ConfigQiniu getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(ConfigQiniu item){
		itemRepository.save(item);
	}
}
