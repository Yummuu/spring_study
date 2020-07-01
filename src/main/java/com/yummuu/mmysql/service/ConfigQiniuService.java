package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.ConfigQiniu;
import java.util.List;

public interface ConfigQiniuService {

	public List<ConfigQiniu> findAll();

	public ConfigQiniu getOne(long id);

	public void save(ConfigQiniu item);

}
