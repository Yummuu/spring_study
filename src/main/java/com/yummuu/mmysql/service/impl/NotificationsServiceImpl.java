package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Notifications;
import com.yummuu.mmysql.repository.NotificationsJpaRepository;
import com.yummuu.mmysql.service.NotificationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationsServiceImpl implements NotificationsService{
	@Autowired
	private NotificationsJpaRepository itemRepository;

	@Override
	public List<Notifications> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Notifications getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Notifications item){
		itemRepository.save(item);
	}
}
