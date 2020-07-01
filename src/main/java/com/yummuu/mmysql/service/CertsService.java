package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Certs;
import java.util.List;

public interface CertsService {

	public List<Certs> findAll();

	public Certs getOne(long id);

	public void save(Certs item);

}
