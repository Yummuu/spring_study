package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.GoodsSpecsValue;
import java.util.List;

public interface GoodsSpecsValueService {

	public List<GoodsSpecsValue> findAll();

	public GoodsSpecsValue getOne(long id);

	public void save(GoodsSpecsValue item);

}
