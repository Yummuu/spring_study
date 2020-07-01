package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Users;
import java.util.List;

public interface UsersService {

	public List<Users> findAll();

	public Users getOne(long id);

	public void save(Users item);

}
