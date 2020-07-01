package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Games;
import java.util.List;

public interface GamesService {

	public List<Games> findAll();

	public Games getOne(long id);

	public void save(Games item);

}
