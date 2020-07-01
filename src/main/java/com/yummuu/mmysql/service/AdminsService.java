package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Admins;
import java.util.List;

public interface AdminsService {

	public List<Admins> findAll();

	public Admins getOne(long id);

	public void save(Admins item);

}
