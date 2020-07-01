package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.Users;
import com.yummuu.mmysql.repository.UsersJpaRepository;
import com.yummuu.mmysql.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService{
	@Autowired
	private UsersJpaRepository itemRepository;

	@Override
	public List<Users> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public Users getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(Users item){
		itemRepository.save(item);
	}
}
