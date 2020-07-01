package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.AdminRoles;
import java.util.List;

public interface AdminRolesService {

	public List<AdminRoles> findAll();

	public AdminRoles getOne(long id);

	public void save(AdminRoles item);

}
