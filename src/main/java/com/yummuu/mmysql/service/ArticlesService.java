package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Articles;
import java.util.List;

public interface ArticlesService {

	public List<Articles> findAll();

	public Articles getOne(long id);

	public void save(Articles item);

}
