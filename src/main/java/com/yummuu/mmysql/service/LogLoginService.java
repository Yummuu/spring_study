package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.LogLogin;
import java.util.List;

public interface LogLoginService {

	public List<LogLogin> findAll();

	public LogLogin getOne(long id);

	public void save(LogLogin item);

}
