package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.LogAlipay;
import java.util.List;

public interface LogAlipayService {

	public List<LogAlipay> findAll();

	public LogAlipay getOne(long id);

	public void save(LogAlipay item);

}
