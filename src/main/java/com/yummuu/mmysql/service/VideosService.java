package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Videos;
import java.util.List;

public interface VideosService {

	public List<Videos> findAll();

	public Videos getOne(long id);

	public void save(Videos item);

}
