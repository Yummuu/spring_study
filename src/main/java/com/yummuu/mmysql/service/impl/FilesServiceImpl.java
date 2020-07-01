package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Files;
import com.yummuu.mmysql.repository.FilesJpaRepository;
import com.yummuu.mmysql.service.FilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilesServiceImpl implements FilesService{
	@Autowired
	private FilesJpaRepository itemRepository;

	@Override
	public List<Files> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Files getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Files item){
		itemRepository.save(item);
	}
}
