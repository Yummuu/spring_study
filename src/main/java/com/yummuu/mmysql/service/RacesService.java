package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Races;
import java.util.List;

public interface RacesService {

	public List<Races> findAll();

	public Races getOne(long id);

	public void save(Races item);

}
