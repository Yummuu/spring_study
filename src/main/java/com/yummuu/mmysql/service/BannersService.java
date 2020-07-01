package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Banners;
import java.util.List;

public interface BannersService {

	public List<Banners> findAll();

	public Banners getOne(long id);

	public void save(Banners item);

}
