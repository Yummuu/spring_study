package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Navigation;
import com.yummuu.mmysql.repository.NavigationJpaRepository;
import com.yummuu.mmysql.service.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NavigationServiceImpl implements NavigationService{
	@Autowired
	private NavigationJpaRepository itemRepository;

	@Override
	public List<Navigation> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Navigation getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Navigation item){
		itemRepository.save(item);
	}
}
