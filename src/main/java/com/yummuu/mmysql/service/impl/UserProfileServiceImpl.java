package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.UserProfile;
import com.yummuu.mmysql.repository.UserProfileJpaRepository;
import com.yummuu.mmysql.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileServiceImpl implements UserProfileService{
	@Autowired
	private UserProfileJpaRepository itemRepository;

	@Override
	public List<UserProfile> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public UserProfile getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(UserProfile item){
		itemRepository.save(item);
	}
}
