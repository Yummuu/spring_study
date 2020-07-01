package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Files;
import java.util.List;

public interface FilesService {

	public List<Files> findAll();

	public Files getOne(long id);

	public void save(Files item);

}
