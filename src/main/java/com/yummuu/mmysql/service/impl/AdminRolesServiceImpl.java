package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.AdminRoles;
import com.yummuu.mmysql.repository.AdminRolesJpaRepository;
import com.yummuu.mmysql.service.AdminRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminRolesServiceImpl implements AdminRolesService{
	@Autowired
	private AdminRolesJpaRepository itemRepository;

	@Override
	public List<AdminRoles> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public AdminRoles getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(AdminRoles item){
		itemRepository.save(item);
	}
}
