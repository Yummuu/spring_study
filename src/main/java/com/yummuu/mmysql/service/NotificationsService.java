package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Notifications;
import java.util.List;

public interface NotificationsService {

	public List<Notifications> findAll();

	public Notifications getOne(long id);

	public void save(Notifications item);

}
