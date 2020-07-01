package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.GamesInput;
import java.util.List;

public interface GamesInputService {

	public List<GamesInput> findAll();

	public GamesInput getOne(long id);

	public void save(GamesInput item);

}
