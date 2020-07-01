package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.GoodsSpecs;
import java.util.List;

public interface GoodsSpecsService {

	public List<GoodsSpecs> findAll();

	public GoodsSpecs getOne(long id);

	public void save(GoodsSpecs item);

}
