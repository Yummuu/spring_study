package com.yummuu.mmysql.service;

import com.yummuu.mmysql.model.Goods;
import java.util.List;

public interface GoodsService {

	public List<Goods> findAll();

	public Goods getOne(long id);

	public void save(Goods item);

}
