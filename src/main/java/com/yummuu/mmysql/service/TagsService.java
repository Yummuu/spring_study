package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Tags;
import java.util.List;

public interface TagsService {

	public List<Tags> findAll();

	public Tags getOne(long id);

	public void save(Tags item);

}
