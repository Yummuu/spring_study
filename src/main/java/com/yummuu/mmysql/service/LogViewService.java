package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.LogView;
import java.util.List;

public interface LogViewService {

	public List<LogView> findAll();

	public LogView getOne(long id);

	public void save(LogView item);

}
