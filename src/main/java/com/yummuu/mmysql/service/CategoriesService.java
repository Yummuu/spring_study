package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Categories;
import java.util.List;

public interface CategoriesService {

	public List<Categories> findAll();

	public Categories getOne(long id);

	public void save(Categories item);

}
