package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Migrations;
import java.util.List;

public interface MigrationsService {

	public List<Migrations> findAll();

	public Migrations getOne(long id);

	public void save(Migrations item);

}
