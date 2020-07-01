package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.UserSocial;
import com.yummuu.mmysql.repository.UserSocialJpaRepository;
import com.yummuu.mmysql.service.UserSocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSocialServiceImpl implements UserSocialService{
	@Autowired
	private UserSocialJpaRepository itemRepository;

	@Override
	public List<UserSocial> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public UserSocial getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(UserSocial item){
		itemRepository.save(item);
	}
}
