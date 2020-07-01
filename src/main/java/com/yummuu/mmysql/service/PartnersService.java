package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Partners;
import java.util.List;

public interface PartnersService {

	public List<Partners> findAll();

	public Partners getOne(long id);

	public void save(Partners item);

}
