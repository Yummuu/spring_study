package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Navigation;
import java.util.List;

public interface NavigationService {

	public List<Navigation> findAll();

	public Navigation getOne(long id);

	public void save(Navigation item);

}
