package com.yummuu.mmysql.service.impl;

import com.yummuu.mmysql.model.AdminPermissions;
import com.yummuu.mmysql.repository.AdminPermissionsJpaRepository;
import com.yummuu.mmysql.service.AdminPermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  AdminPermissionsServiceImpl implements AdminPermissionsService{
	@Autowired
	private AdminPermissionsJpaRepository itemRepository;

	@Override
	public List<AdminPermissions> findAll(){
		return itemRepository.findAll();
	}

	@Override
	public AdminPermissions getOne(long id){
		return itemRepository.getOne(id);
	}

	@Override
	public void save(AdminPermissions item){
		itemRepository.save(item);
	}
}
