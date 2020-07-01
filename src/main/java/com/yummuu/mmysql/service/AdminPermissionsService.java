package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.AdminPermissions;
import java.util.List;

public interface AdminPermissionsService {

	public List<AdminPermissions> findAll();

	public AdminPermissions getOne(long id);

	public void save(AdminPermissions item);

}
