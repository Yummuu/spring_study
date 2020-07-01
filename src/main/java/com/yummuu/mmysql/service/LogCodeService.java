package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.LogCode;
import java.util.List;

public interface LogCodeService {

	public List<LogCode> findAll();

	public LogCode getOne(long id);

	public void save(LogCode item);

}
