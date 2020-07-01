package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.LogAdmin;
import java.util.List;

public interface LogAdminService {

	public List<LogAdmin> findAll();

	public LogAdmin getOne(long id);

	public void save(LogAdmin item);

}
