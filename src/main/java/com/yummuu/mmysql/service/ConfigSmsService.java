package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.ConfigSms;
import java.util.List;

public interface ConfigSmsService {

	public List<ConfigSms> findAll();

	public ConfigSms getOne(long id);

	public void save(ConfigSms item);

}
