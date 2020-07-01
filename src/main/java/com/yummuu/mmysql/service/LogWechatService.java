package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.LogWechat;
import java.util.List;

public interface LogWechatService {

	public List<LogWechat> findAll();

	public LogWechat getOne(long id);

	public void save(LogWechat item);

}
