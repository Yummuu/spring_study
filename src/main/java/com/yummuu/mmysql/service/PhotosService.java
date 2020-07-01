package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Photos;
import java.util.List;

public interface PhotosService {

	public List<Photos> findAll();

	public Photos getOne(long id);

	public void save(Photos item);

}
