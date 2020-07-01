package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Photos;
import com.yummuu.mmysql.repository.PhotosJpaRepository;
import com.yummuu.mmysql.service.PhotosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotosServiceImpl implements PhotosService{
	@Autowired
	private PhotosJpaRepository itemRepository;

	@Override
	public List<Photos> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Photos getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Photos item){
		itemRepository.save(item);
	}
}
