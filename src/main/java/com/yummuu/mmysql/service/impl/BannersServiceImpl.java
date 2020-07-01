package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Banners;
import com.yummuu.mmysql.repository.BannersJpaRepository;
import com.yummuu.mmysql.service.BannersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannersServiceImpl implements BannersService{
	@Autowired
	private BannersJpaRepository itemRepository;

	@Override
	public List<Banners> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Banners getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Banners item){
		itemRepository.save(item);
	}
}
