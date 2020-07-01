package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Albums;
import java.util.List;

public interface AlbumsService {

	public List<Albums> findAll();

	public Albums getOne(long id);

	public void save(Albums item);

}
